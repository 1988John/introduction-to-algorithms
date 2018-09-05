package com.ita.heap;

/**
 * @author jiangwang3
 * @date 2018/9/5.
 */
public interface Heap {
    int parent(int i);

    int left(int i);

    int right(int i);

    int maxHeapify(int i);

    void buildMaxHeap(int[] array);

    int[] heapSort(int[] array);

    void insert(int value);

    int[] getArray();

    int take();
}
