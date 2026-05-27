@Component
public class TutorAgent {

    @Autowired
    private OpenAIClient openAIClient;

    @Autowired
    private VectorService vectorService;

    public String run(UserRequest request) {

        // ✅ RAG: search context
        var context = vectorService.search(request.getQuestion());

        String prompt = PromptTemplates.tutorPrompt(
                request.getQuestion(),
                context
        );

        String response = openAIClient.generate(prompt);

        // ✅ Save memory
        vectorService.store(request.getQuestion() + " " + response);

        return response;
    }
}