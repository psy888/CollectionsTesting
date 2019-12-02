package com.psy888;

public class MyLinkedList {
    int size;
    MyElement head;

    public void add(Object val) {
        if (head == null) head = new MyElement(val);
        MyElement curElement = head;
        while (curElement.getNext() != null) {
            curElement = curElement.getNext();
        }
        curElement.setNext(new MyElement(val));
        size++;
    }

    public void remove(int index) {
        if (index == 0) {
            if (head.getNext() != null) {
                head = head.getNext();
            } else {
                head = null; //если остался один елемент
            }

            size--;
            return;
        }
        MyElement curElement = head;
        int curIndex = 0;
        while (curElement.getNext() != null) {
            if (curIndex == index - 1) break;
            curElement = curElement.getNext();
            curIndex++;
        }
        try {
            curElement.setNext(curElement.getNext().getNext());
            size--;
        } catch (NullPointerException ex) {
            System.out.println("curIndex = " + curIndex);
            System.out.println("index = " + index);
        }
    }

    public int size() {
        return size;
    }


}
