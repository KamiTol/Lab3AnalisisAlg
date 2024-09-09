package org.example.Sorts;

import org.example.Util.Array;

import java.util.Random;

public class WordsHeapSort {
    public static void main(String[] args) {
        HeapSort<String> heapSort = new HeapSort<>();
        Random random = new Random();

        String[] words = {"apple", "banana", "cherry", "date", "elderberry"};
        int dataSize = words.length;

        Array<String> orderedWords = new Array<>(dataSize);
        Array<String> reversedWords = new Array<>(dataSize);
        Array<String> randomWords = new Array<>(dataSize);

        for (int i = 0; i < dataSize; i++) {
            orderedWords.setElement(i, words[i % words.length]);
            reversedWords.setElement(i, words[(dataSize - i - 1) % words.length]);
            randomWords.setElement(i, words[random.nextInt(words.length)]);
        }

        long startTime, endTime;

        startTime = System.nanoTime();
        heapSort.sort(orderedWords);
        endTime = System.nanoTime();
        System.out.println("HeapSort (ordered words): " + (endTime - startTime) + " nanoseconds");

        startTime = System.nanoTime();
        heapSort.sort(reversedWords);
        endTime = System.nanoTime();
        System.out.println("HeapSort (reversed words): " + (endTime - startTime) + " nanoseconds");

        startTime = System.nanoTime();
        heapSort.sort(randomWords);
        endTime = System.nanoTime();
        System.out.println("HeapSort (random words): " + (endTime - startTime) + " nanoseconds");
    }
}