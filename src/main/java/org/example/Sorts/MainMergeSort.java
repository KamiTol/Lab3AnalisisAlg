package org.example.Sorts;

import org.example.Util.Array;

import java.util.Random;

public class MainMergeSort {
    public static void main(String[] args) {
        MergeSort<Integer> mergeSort = new MergeSort<>();
        Random random = new Random();

        int[] dataSizes = {10, 15, 20, 100, 350, 500, 1000, 3500, 5000};

        for (int dataSize : dataSizes) {
            Array<Integer> numbers = new Array<>(dataSize);
            for (int i = 0; i < dataSize; i++) {
                numbers.setElement(i, random.nextInt(100));
            }

            long startTime = System.nanoTime();
            mergeSort.sort(numbers, 0, numbers.getSize() - 1);
            long endTime = System.nanoTime();
            System.out.println("MergeSort (" + dataSize + " numbers): " + (endTime - startTime) + " nanoseconds");
        }
    }
}