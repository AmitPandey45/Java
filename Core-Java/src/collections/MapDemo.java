package src.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<String, Integer>();
        students.put("Student1", 75);
        students.put("Student2", 55);
        students.put("Student3", 57);
        students.put("Student4", 87);
        students.put("Student5", 97);
        students.put("Student6", 15);

        students.put("Student6", 45);

        System.out.println(students);

        Set<String> keys = students.keySet();
        System.out.println("Keys: " + keys);
        Collection<Integer> values = students.values();
        System.out.println("Values: " + values);

        for (String key : keys) {
            System.out.println("Key: " + key + " Value: " + students.get(key));
        }

        for (Integer value : values) {
            System.out.println("Value: " + value);
        }

        for (Map.Entry<String, Integer> student : students.entrySet()) {
            System.out.println("Key: " + student.getKey() + " Value: " + student.getValue());
        }
    }
}
