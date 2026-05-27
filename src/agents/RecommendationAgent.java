@Component
public class RecommendationAgent {

    public List<LearningItem> run(List<String> gaps) {

        return gaps.stream().map(gap -> {
            LearningItem item = new LearningItem();
            item.setTopic(gap);
            item.setType("Video + Practice");
            return item;
        }).toList();
    }
}
``