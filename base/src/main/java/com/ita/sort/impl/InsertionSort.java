package com.ita.sort.impl;

import com.ita.sort.Rank;

/**
 * @author jiangwang3
 * @date 2018/9/12.
 */
public class InsertionSort implements Rank{
    @Override
    public void sort(int[] array) {
        int length = array.length;
        if (length<=1){
            return;
        }

        for (int i=1;i<length;i++){
            for (int j=0;j<i;j++){
                if (array[i] > array[j]){
                    int temp = array[i];
                    System.arraycopy(array, j, array, j+1,i-j);
                    array[j] = temp;
                    break;
                }
            }
        }
    }
}
