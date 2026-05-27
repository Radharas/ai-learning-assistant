@RestController
@RequestMapping("/api/tutor")
public class TutorController {

    @Autowired
    private TutorService tutorService;

    @PostMapping("/ask")
    public FinalResponse ask(@RequestBody UserRequest request) {
        return tutorService.process(request);
    }
}