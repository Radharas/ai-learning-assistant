@Service
public class VectorService {

    public List<String> search(String query) {
        // TODO: integrate Pinecone / FAISS
        return List.of("Recursion involves base case", "Function calls itself");
    }

    public void store(String text) {
        // TODO: store embedding in vector DB
    }
}