package com.Practice_Problem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class DemoList {
    public static void main(String[] args) {
        List l = new ArrayList();

        l.add(10);
        l.add(20);
        l.add(30);
        l.add(20);
        l.add(50);
        l.add(30);
//          Normal List Is print
        System.out.println(l);
//          List is print by Iterator
//        Iterator itr = l.iterator();
//        while(itr.hasNext()) {
//            System.out.println(itr.next());
//        }

//          List is print by ListIterator
        ListIterator litr = l.listIterator();
        while (litr.hasNext()){
            System.out.println(litr.next());
        }
    }
}
