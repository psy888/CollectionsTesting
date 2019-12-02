package com.psy888;



import java.util.*;

public class MyArrayList<Integer> {
    private int baseSize = 10;
    private java.lang.Integer[] array;
    private int size;

    public MyArrayList() {
        this.array =  new java.lang.Integer[baseSize];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        if (size > 0) {
            return false;
        } else {
            return true;
        }
    }

    public boolean contains(Object o) {
        return false;
    }

    public Iterator iterator() {
        return null;
    }

    public java.lang.Integer[] toArray() {
        return (java.lang.Integer[]) new Object[0];
    }

    public boolean add(java.lang.Integer o) {
        if (size < baseSize) {
            array[size] = o;
            size++;
            return true;
        } else {
            increaseSizeAndCopyValues();
            return add(o);
        }
//        return false;
    }

    public boolean remove(java.lang.Integer o) {
        return false;
    }

    public boolean addAll(Collection c) {
        return false;
    }

    public boolean addAll(int index, Collection c) {
        return false;
    }

    public void clear() {
        size = 0;
        array = (java.lang.Integer[]) new Object[10];
    }

    public java.lang.Integer get(int index) {

        return array[index];
    }

    public Object set(int index, Object element) {
        return null;
    }

    public void add(int index, java.lang.Integer element) {
        if (size == baseSize) {
            increaseSizeAndCopyValues();
        }

        java.lang.Integer[] tmpArr = Arrays.copyOfRange(array, index, size - 1);
        array[index] = element;
        size++;

//        for (int i = 0; i < tmpArr.length; i++) {
//            array[i+index+1] = tmpArr[i];
//        }
        System.arraycopy(tmpArr, 0, array, index + 1, tmpArr.length);

    }

    public java.lang.Integer remove(int index) {
        java.lang.Integer removedVal = array[index];
//        java.lang.Integer[] tmpArr = Arrays.copyOfRange(array, index + 1, size);
//        System.arraycopy(tmpArr, 0, array, index, tmpArr.length);
        System.arraycopy(array, index+1, array, index, size-index-1);
        size--;
        return removedVal;
    }

    public int indexOf(Object o) {
        return 0;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }

    public ListIterator listIterator() {
        return null;
    }

    public ListIterator listIterator(int index) {
        return null;
    }

    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    public boolean retainAll(Collection c) {
        return false;
    }

    public boolean removeAll(Collection c) {
        return false;
    }

    public boolean containsAll(Collection c) {
        return false;
    }

    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    private void increaseSizeAndCopyValues() {
        baseSize *= 2;
        this.array = Arrays.copyOf(array, size+baseSize);
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
