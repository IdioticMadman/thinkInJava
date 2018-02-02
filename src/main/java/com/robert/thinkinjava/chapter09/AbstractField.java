package com.robert.thinkinjava.chapter09;

abstract class Child {

    public Child() {
        print();
    }

    abstract void print();
}

public class AbstractField extends Child {

    int a = 2;

    void print() {
        System.out.println("a的值为：" + a);
    }

    public static void main(String[] args){
        AbstractField a = new AbstractField();
        a.print();
    }
}
