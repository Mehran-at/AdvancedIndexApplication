// Matilda just bought a new book about social impact and as she opens it, she sees the index
// . Create the AdvancedIndexApplication class and write the following instructions in its main method:
// . Create the Topic class that has a name.
// . Create an empty index map connecting Integer for the page numbers and a List of Topic for the several book topics that will appear in each page and display it.
// . Create two Integers that represent two different page numbers.
// . Create three Topic objects.
// . Create two lists: topics1 and topics2.
// . Add one Topic to topics1 and two into topics2.
// . Put the page numbers and topics1 and topics2 respectively into the index map .
// . Display the map keys. To display the Topic class create the toString method.
// . Display the map values. To display the Topic class create the toString method.
// . Create another different Topic.
// . Get the topics1 from the map and call it stored. Add to stored the last Topic you created. Display the map.
// . Ask if one of the keys is contained in the map and display the answer.
// . Get the topics2 from the map and call it stored2 and display it.
// . Display its size.
//    Hints:
//   >Use Intellij shortcuts to create the toString and equals methods.

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
