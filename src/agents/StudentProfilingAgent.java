@Component
public class StudentProfilingAgent {

    public StudentProfile run(UserRequest request) {

        StudentProfile profile = new StudentProfile();
        profile.setLevel("Intermediate");
        profile.setStrengths(List.of("Arrays", "Loops"));
        profile.setWeaknesses(List.of("Recursion"));

        return profile;
    }
}