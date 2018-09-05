package com.ita.heap;

import com.ita.heap.impl.HeapImpl;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author jiangwang3
 * @date 2018/9/5.
 */
public class App {
    public static void main(String[] args) {
//        int[] array = {1,2,3,4,5,6,7,8};
//
//        Heap heap = new HeapImpl();
////        heap.maxHeapify(array,0);
////        heap.buildMaxHeap(array);
//        for (int i=0;i<array.length;i++){
//            heap.insert(array[i]);
//        }
//        Queue queue = new PriorityQueue();
//        heap.insert(20);
//        System.out.println(Arrays.toString(heap.getArray()));

        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(1000);
        queue.add(201);
        queue.add(61);
        queue.add(100);
        System.out.println(queue);
    }
}
