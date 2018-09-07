package com.ita.heap.test;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * @author jiangwang3
 * @date 2018/9/6.
 */
public class EntrySetTest {
    public static void main(String[] args) throws Exception{
        Map<Integer,String> map = new HashMap<>();
        map.put(10000,"aa");
        map.put(10,"zz");

        Field entrySetField = HashMap.class.getDeclaredField("entrySet");
        entrySetField.setAccessible(true);
        Object entrySet = entrySetField.get(map);
        System.out.println("entrySet = " + entrySet);
        System.out.println("map.toString() = " + map.toString());
        entrySet = entrySetField.get(map);
        System.out.println("entrySet = " + entrySet);

    }
}
