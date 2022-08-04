package com.Practice_Problem;

import java.util.HashMap;
import java.util.Map;

public class DemoMap {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(101,"Anshul");
        map.put(201,"Ashish");
        map.put(302,"Chavi");
        //Elements can traverse in any order
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
