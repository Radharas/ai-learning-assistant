public class PromptTemplates {

    public static String tutorPrompt(String question, List<String> context) {

        return """
            You are an expert tutor.

            Context:
            %s

            Question:
            %s

            Instructions:
            - Explain step-by-step
            - Give examples
            - Add 1 practice problem
            """.formatted(String.join("\n", context), question);
    }
}