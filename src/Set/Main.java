package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        //Множества -- только уникальные значения
        Set<Integer> hashSet = new HashSet<>(); //случайный поряд
        Set<Integer> treeSet = new TreeSet<>(); // отсортировано
        Set<Integer> linkedHashSet = new LinkedHashSet<>(); // хранится в порядке добавления

        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(5);

        treeSet.add(5);
        treeSet.add(3);
        treeSet.add(4);
        treeSet.add(7);
        treeSet.add(6);

        linkedHashSet.add(5);
        linkedHashSet.add(4);
        linkedHashSet.add(6);
        linkedHashSet.add(7);
        linkedHashSet.add(8);

        System.out.println("hashSet: " + hashSet);
        System.out.println("treeSet:" + treeSet);
        System.out.println("LinkHS :" + linkedHashSet);

        //объединение только уникальных остальные игнорируются
        HashSet<Integer> set1 = new HashSet<>(hashSet);
        set1.addAll(treeSet);
        System.out.println("add HashSet & TreeSet = " + set1);

//        вычитание только тех значений кторые присутствуют в коллекции которая передается параметром
        set1.removeAll(linkedHashSet);
        System.out.println("remove hashSet & LinkedHS = " + set1);

        set1 = new HashSet<>(hashSet);
        set1.retainAll(treeSet);
        System.out.println("пересечение  hashSet & treeSet= " + set1);
    }
}
