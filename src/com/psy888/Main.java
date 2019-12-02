package com.psy888;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        List<Integer> myArrayListOld = new MyArrayListOld();
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        MyLinkedList myLinkedList = new MyLinkedList();


        int i = 0;
        do {
//            measureTime(linkedList, "--LinkedList");
//            measureTime(myArrayList, "-MyArrayList");
//            measureTime(myArrayListOld, "-MyArrayListOld");
//            measureTime(arrayList, "ArrayList");
            measureTime(myLinkedList, "MyLinkedList");
            i++;
        } while (i != 3);
    }

    public static void measureTime(List<Integer> list, String collectionName) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.printf(collectionName + " Add time : %d milliseconds \t\t", (end - start));


        start = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            list.remove(i);

        }
        end = System.currentTimeMillis();

        System.out.printf("Remove time : %d milliseconds %n", (end - start));
    }

    public static void measureTime(MyArrayList<Integer> list, String collectionName) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.printf(collectionName + " Add time : %d milliseconds \t\t", (end - start));


        start = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            list.remove(i);

        }
        end = System.currentTimeMillis();

        System.out.printf("Remove time : %d milliseconds %n", (end - start));
    }

    public static void measureTime(MyLinkedList list, String collectionName) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.printf(collectionName + " Add time : %d milliseconds \t\t", (end - start));


        start = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            list.remove(i);

        }
        end = System.currentTimeMillis();

        System.out.printf("Remove time : %d milliseconds %n", (end - start));
    }
}

