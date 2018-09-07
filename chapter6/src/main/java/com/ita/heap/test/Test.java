package com.ita.heap.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author jiangwang3
 * @date 2018/9/6.
 */
public class Test {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(10000,"aa");
        map.put(10,"zz");
        map.put(3,"bc");
        map.put(8,"ttt");

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        System.out.println(entries.size());
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println("key="+entry.getKey()+",value="+entry.getValue());
        }
    }
}
