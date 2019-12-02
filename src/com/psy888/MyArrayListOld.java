package com.psy888;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyArrayListOld implements List {

    private int baseSize = 10;
    private Object[] array;
    private int size;

    public MyArrayListOld() {
        array = new Object[baseSize];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        if (size == array.length) {
            increaseSizeAndCopyValues();
        }

        array[size++] = o;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {
        array = null;
        baseSize = 10;
        size = 0;
        array = new Object[10];
    }

    @Override
    public Object get(int index) {
        return array[index];
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {
        if (size==array.length) increaseSizeAndCopyValues();
        for (int i = size+1; i > index; i--) {
            array[i] = array[i-1];
        }
        array[index] = element;
        size++;

    }

    @Override
    public Object remove(int index) {
        Object tmp = array[index];
        for (int i = index; i < size; i++) {
            array[i]=array[i+1];
        }
        size--;
        return tmp;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    private void increaseSizeAndCopyValues() {
        baseSize = baseSize * 2;
        Object[] newArray = new Object[size + baseSize];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }
}
