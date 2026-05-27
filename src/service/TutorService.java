@Service
public class TutorService {

    @Autowired
    private SupervisorAgent supervisorAgent;

    public FinalResponse process(UserRequest request) {
        return supervisorAgent.execute(request);
    }
}