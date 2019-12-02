package com.psy888;

public class MyElement {
    MyElement next;
    Object val;

    public MyElement(Object val) {
        this.val = val;
    }

    public MyElement getNext() {
        return next;
    }

    public void setNext(MyElement next) {
        this.next = next;
    }

    public Object getVal() {
        return val;
    }

    public void setVal(Object val) {
        this.val = val;
    }
}
