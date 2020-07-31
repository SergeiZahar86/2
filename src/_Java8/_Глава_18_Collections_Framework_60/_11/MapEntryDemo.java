package _Java8._Глава_18_Collections_Framework_60._11;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class MapEntryDemo {
    public static void main (String[] args) {
        Map <String, String> map = new HashMap <>();
        map.put("01000005", "Tom");
        map.put("01000002", "Jerry");
        map.put("01000003", "Tom");
        map.put("01000004", "Donald");
        // Получить набор entry.
        // Эти entry могут быть не расспределены по ключам (key).
        Set <Map.Entry <String, String>> entries = map.entrySet();
        for (Map.Entry <String, String> entry : entries) {
            System.out.println("Phone: " + entry.getKey() + " : " + entry.getValue());
        }
    }
}
