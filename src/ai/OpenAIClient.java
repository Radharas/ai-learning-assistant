@Component
public class OpenAIClient {

    @Autowired
    private ChatClient chatClient;

    public String generate(String prompt) {
        return chatClient.call(prompt);
    }
}