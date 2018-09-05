package com.ita.heap.impl;

import com.ita.heap.Heap;

import java.util.Arrays;

/**
 * @author jiangwang3
 * @date 2018/9/5.
 */
public class HeapImpl implements Heap{

    private int[] array = new int[0];

    public HeapImpl() {
    }

    public HeapImpl(int[] array) {
        this.array = array;
    }

    @Override
    public int parent(int i) {
        return (i-1)/2;
    }

    @Override
    public int left(int i) {
        return (i<<1) + 1;
    }

    @Override
    public int right(int i) {
        return (i<<1)+2;
    }

    @Override
    public int maxHeapify(int i) {
        int l = left(i);
        int r = right(i);
        int largest = i;
        if (l<array.length && array[l]>=array[i]){
            largest = l;
        }
        if (r<array.length && array[r]>=array[largest]){
            largest = r;
        }
        if (largest != i){
            exchange(array,largest,i);
            maxHeapify(largest);
        }
        return 0;
    }

    @Override
    public void buildMaxHeap(int[] array) {

        for (int i=array.length/2-1;i>=0;i--){
            maxHeapify(i);
        }
    }

    @Override
    public int[] heapSort(int[] array) {
        return new int[0];
    }

    @Override
    public void insert(int value) {
        array = Arrays.copyOf(array, array.length+1);
        int i = array.length-1;
        while (i>0 && array[parent(i)]<value){
            array[i] = array[parent(i)];
            i = parent(i);
        }
        array[i] = value;
    }

    @Override
    public int[] getArray() {
        return array;
    }

    @Override
    public int take() {
        return array[array.length-1];
    }

    /**
     * 交换数组中 x，y 位置的值
     * @author jiangwang
     * @date 10:43 2018/9/5
     */
    private void exchange(int[] array,int x,int y){
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
}
