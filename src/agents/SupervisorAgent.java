@Component
public class SupervisorAgent {

    @Autowired private StudentProfilingAgent profilingAgent;
    @Autowired private KnowledgeGapAgent gapAgent;
    @Autowired private RecommendationAgent recommendationAgent;
    @Autowired private TutorAgent tutorAgent;

    public FinalResponse execute(UserRequest request) {

        FinalResponse response = new FinalResponse();

        if ("QUIZ".equals(request.getType())) {
            var profile = profilingAgent.run(request);
            var gaps = gapAgent.run(request, profile);
            var path = recommendationAgent.run(gaps);

            response.setProfile(profile);
            response.setGaps(gaps);
            response.setLearningPath(path);
        }

        if ("QUESTION".equals(request.getType())) {
            response.setTutorResponse(tutorAgent.run(request));
        }

        return response;
    }
}