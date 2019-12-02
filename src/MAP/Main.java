package MAP;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        Map<Integer, String> treeMap = new TreeMap<>();

        System.out.println("HashMap ->");
        hashMap.put(2, "Two");
        hashMap.put(1, "One");
        hashMap.put(0, "Zero");
        hashMap.put(4, "Four");
        hashMap.put(3, "Three");
        hashMap.put(99, "Three");
        hashMap.put(27, "Three");

        System.out.println(hashMap);

        hashMap.put(0, "New Zero"); //перезапись елемента с ключем "0"

        System.out.println(hashMap);

        //map - not iterable - порядок вывода не определен
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());

        }
        System.out.println("LinkedHashMap ->");
        linkedHashMap.put(1, "One");
        linkedHashMap.put(3, "Three");
        linkedHashMap.put(2, "Two");
        linkedHashMap.put(0, "Zero");
        linkedHashMap.put(4, "Four");

        //вывод и хрранятса в том же порядке в которм добавлены
        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("TreeMap ->");
        treeMap.put(1, "One");
        treeMap.put(3, "Three");
        treeMap.put(2, "Two");
        treeMap.put(0, "Zero");
        treeMap.put(4, "Four");
        treeMap.put(99, "Four");
        treeMap.put(23, "Four");
        treeMap.put(45, "Four");

        System.out.println(treeMap);

        //автоматически сортируется по ключу
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());

        }


    }
}
