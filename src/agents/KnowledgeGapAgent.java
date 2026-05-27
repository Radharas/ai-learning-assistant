@Component
public class KnowledgeGapAgent {

    public List<String> run(UserRequest request, StudentProfile profile) {

        return List.of(
                "Recursion basics",
                "Base case understanding",
                "Memoization"
        );
    }
}