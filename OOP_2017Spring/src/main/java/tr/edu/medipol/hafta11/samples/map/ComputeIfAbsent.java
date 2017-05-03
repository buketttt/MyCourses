package tr.edu.medipol.hafta11.samples.map;

import java.util.HashMap;
import java.util.Map;

/**
 * If you want to add a new entry automatically to a map if it is not present
 * you can use the computeIfAbsent method to calculate a value and add it to the
 * map.
 * 
 * http://www.vogella.com/tutorials/JavaCollections/article.html
 *
 */
public class ComputeIfAbsent {
    public static void main(String[] args) {

        Map<String, Integer> map = createMap();

        Integer calculatedVaue = map.computeIfAbsent("Java", it -> 0);
        System.out.println(calculatedVaue);

        // write to command line
        map.keySet().forEach(
                key -> System.out.println(key + " " + map.get(key)));
    }

    private static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Eclipse IDE", 0);
        map.put("Eclipse RCP", 0);
        map.put("Git", 0);
        map.put("Groovy", 0);
        return map;
    }
}
