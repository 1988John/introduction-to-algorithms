package com.ita.sort.utils;

/**
 * @author jiangwang3
 * @date 2018/9/12.
 */
public class ArrayUtils {
    public static int[] swift(int x,int y,int[] array){
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
        return array;
    }

}
