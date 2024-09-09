package org.example.Sorts;

import org.example.Util.Array;

import java.util.Random;

public class MainHeapSort {
    public static void main(String[] args) {
        HeapSort<Integer> heapSort = new HeapSort<>();
        Random random = new Random();

        int[] dataSizes = {10, 15, 20, 100, 350, 500, 1000, 3500, 5000};

        for (int dataSize : dataSizes) {
            Array<Integer> numbers = new Array<>(dataSize);
            for (int i = 0; i < dataSize; i++) {
                numbers.setElement(i, random.nextInt(100));
            }

            long startTime = System.nanoTime();
            heapSort.sort(numbers);
            long endTime = System.nanoTime();
            System.out.println("HeapSort (" + dataSize + " numbers): " + (endTime - startTime) + " nanoseconds");
        }
    }
}