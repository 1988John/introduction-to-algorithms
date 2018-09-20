package com.ita.sort;

import com.ita.sort.impl.InsertionSort;
import com.ita.sort.impl.MergeSort;

import java.util.Arrays;

/**
 * @author jiangwang3
 * @date 2018/9/12.
 */
public class Main {
    public static void main(String[] args) {
        int[] array = {5,2,4,7,6,1,8,3};

//        Rank rank = new InsertionSort();
        Rank rank = new MergeSort();

        rank.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
