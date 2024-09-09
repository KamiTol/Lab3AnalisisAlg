package org.example.Sorts;

import org.example.Util.Array;

import java.util.Random;

public class WordQuickSort {
    public static void main(String[] args) {
        QuickSort<String> quickSort = new QuickSort<>();
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
        quickSort.sort(orderedWords, 0, orderedWords.getSize() - 1);
        endTime = System.nanoTime();
        System.out.println("QuickSort (ordered words): " + (endTime - startTime) + " nanoseconds");

        startTime = System.nanoTime();
        quickSort.sort(reversedWords, 0, reversedWords.getSize() - 1);
        endTime = System.nanoTime();
        System.out.println("QuickSort (reversed words): " + (endTime - startTime) + " nanoseconds");

        startTime = System.nanoTime();
        quickSort.sort(randomWords, 0, randomWords.getSize() - 1);
        endTime = System.nanoTime();
        System.out.println("QuickSort (random words): " + (endTime - startTime) + " nanoseconds");
    }
}