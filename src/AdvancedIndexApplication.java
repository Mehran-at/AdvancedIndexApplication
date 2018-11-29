import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

    public class AdvancedIndexApplication {
    public static void main(String[] args) {
        Map<Integer, List<Topic>> index = new HashMap<>();
        System.out.println("\n" + index);
        Integer pageNumberOne = 36;
        Integer pageNumberTwo = 54;
        Integer pageNumberThree = 59;
        Topic topic1 = new Topic("First Topic");
        Topic topic2 = new Topic("Second Topic");
        Topic topic3 = new Topic("Third Topic");
        Topic topic4 = new Topic("Fifth topic");
        List<Topic> bookTopic1 = new ArrayList<>();
        List<Topic> bookTopic2 = new ArrayList<>();
        List<Topic> bookTopic3 = new ArrayList<>();
        bookTopic1.add(topic1);
        bookTopic2.add(topic2);
        bookTopic2.add(topic3);
        bookTopic3.add(topic4);
        index.put(pageNumberOne, bookTopic1);
        index.put(pageNumberTwo,bookTopic2);
        index.put(pageNumberThree, bookTopic3);
        System.out.println("\n" + index.keySet());
        System.out.println("\n" + index.values());
        Topic topic5 = new Topic("Fourth topic");
        List<Topic> stored = index.get(pageNumberOne);
        stored.add(topic5);
        System.out.println("\n" + index.entrySet());
        System.out.println("\n" + index.containsKey(36));
        List<Topic> stored2 = index.get(topic2);
        System.out.println("\n" + stored2);
        System.out.println("\n" + index.containsKey(59));
        List<Topic> stored3 = index.get(topic3);
        System.out.println(stored3);
    }
}
