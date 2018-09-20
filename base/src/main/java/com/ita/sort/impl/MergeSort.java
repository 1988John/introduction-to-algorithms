package com.ita.sort.impl;

import com.ita.sort.Rank;

/**
 * <a href="https://www.cnblogs.com/chengxiao/p/6194356.html">算法图解说明</a>
 * @author jiangwang3
 * @date 2018/9/12.
 */
public class MergeSort implements Rank{
    @Override
    public void sort(int[] array) {
        int left = 0;
        int right = array.length-1;
        int[] temp = new int[array.length];
        splitSort(array,left,right,temp);
    }

    private void splitSort(int[] array,int left,int right,int[] temp){
        if (left<right){
            int mid = (left + right)/2;
            splitSort(array,left,mid,temp);
            splitSort(array,mid+1,right,temp);
            merge(array,left,mid,right,temp);
        }

    }

    private void merge(int[] arr,int left,int mid,int right,int[] temp){
        int i = left;
        int j = mid+1;
        int t = 0;

        while (i<=mid && j<=right){
            if (arr[i]>=arr[j]){
                temp[t++] = arr[i++];
            }else {
                temp[t++] = arr[j++];
            }
        }

        while (i<=mid){
            temp[t++] = arr[i++];
        }

        while (j<=right){
            temp[t++] = arr[j++];
        }

        t = 0;
        while (left <= right){
            arr[left++] = temp[t++];
        }
    }
}
