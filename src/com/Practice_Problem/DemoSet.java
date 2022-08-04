package com.Practice_Problem;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DemoSet {
    public static void main(String[] args) {
        Set s = new HashSet();

        s.add(10);
        s.add(20);
        s.add(30);
        s.add(40);
        s.add(null);
//      Normal Set is print

        System.out.println(s);

//        set is print by Iterator

        Iterator itr = s.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
