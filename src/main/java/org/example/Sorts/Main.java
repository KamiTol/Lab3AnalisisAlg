package org.example.Sorts;

import org.example.Util.Array;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de los algoritmos de ordenamiento
        QuickSort<Integer> quickSort = new QuickSort<>();
        MergeSort<Integer> mergeSort = new MergeSort<>();
        HeapSort<Integer> heapSort = new HeapSort<>();

        // Crear instancias de los algoritmos de ordenamiento para cadenas
        QuickSort<String> quickSortString = new QuickSort<>();
        MergeSort<String> mergeSortString = new MergeSort<>();
        HeapSort<String> heapSortString = new HeapSort<>();

        // Crear listas de números ordenados, en orden inverso y aleatorios
        Array<Integer> orderedNumbers = new Array<>(10);
        Array<Integer> reversedNumbers = new Array<>(10);
        Array<Integer> randomNumbers = new Array<>(10);

        // Crear un generador de números aleatorios
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            orderedNumbers.setElement(i, i);
            reversedNumbers.setElement(i, 10 - i);
            randomNumbers.setElement(i, random.nextInt(10));
        }

        // Crear listas de números de diferentes tamaños y variaciones
        Array<Integer> smallNumbers = new Array<>(10);
        for (int i = 0; i < 10; i++) {
            smallNumbers.setElement(i, random.nextInt(100));
        }

        Array<Integer> mediumNumbers = new Array<>(100);
        for (int i = 0; i < 100; i++) {
            mediumNumbers.setElement(i, random.nextInt(100));
        }

        Array<Integer> largeNumbers = new Array<>(1000);
        for (int i = 0; i < 1000; i++) {
            largeNumbers.setElement(i, random.nextInt(100));
        }

        // Crear listas de palabras ordenadas, en orden inverso y aleatorias
        Array<String> orderedWords = new Array<>(5);
        Array<String> reversedWords = new Array<>(5);
        Array<String> randomWords = new Array<>(5);

        String[] words = {"apple", "banana", "cherry", "date", "elderberry"};
        for (int i = 0; i < 5; i++) {
            orderedWords.setElement(i, words[i]);
            reversedWords.setElement(i, words[5 - i - 1]);
            randomWords.setElement(i, words[random.nextInt(5)]);
        }

        // Crear listas de palabras de diferentes tamaños y variaciones
        Array<String> smallWords = new Array<>(5);
        smallWords.setElement(0, "apple");
        smallWords.setElement(1, "banana");
        smallWords.setElement(2, "cherry");
        smallWords.setElement(3, "date");
        smallWords.setElement(4, "elderberry");

        Array<String> mediumWords = new Array<>(100);
        for (int i = 0; i < 100; i++) {
            mediumWords.setElement(i, random.ints(97, 123)
                    .limit(5)
                    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                    .toString());
        }

        Array<String> largeWords = new Array<>(1000);
        for (int i = 0; i < 1000; i++) {
            largeWords.setElement(i, random.ints(97, 123)
                    .limit(5)
                    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                    .toString());
        }

        // Ordenar las listas con cada algoritmo de ordenamiento
        quickSort.sort(smallNumbers, 0, smallNumbers.getSize() - 1);
        mergeSort.sort(mediumNumbers, 0, mediumNumbers.getSize() - 1);
        heapSort.sort(largeNumbers);

        quickSortString.sort(smallWords, 0, smallWords.getSize() - 1);
        mergeSortString.sort(mediumWords, 0, mediumWords.getSize() - 1);
        heapSortString.sort(largeWords);

        // Ordenar las listas con cada algoritmo de ordenamiento y medir el tiempo de ejecución
        long startTime, endTime;

        startTime = System.nanoTime();
        quickSort.sort(smallNumbers, 0, smallNumbers.getSize() - 1);
        endTime = System.nanoTime();
        System.out.println("QuickSort (small numbers): " + (endTime - startTime) + " nanoseconds");

        startTime = System.nanoTime();
        mergeSort.sort(mediumNumbers, 0, mediumNumbers.getSize() - 1);
        endTime = System.nanoTime();
        System.out.println("MergeSort (medium numbers): " + (endTime - startTime) + " nanoseconds");

        startTime = System.nanoTime();
        heapSort.sort(largeNumbers);
        endTime = System.nanoTime();
        System.out.println("HeapSort (large numbers): " + (endTime - startTime) + " nanoseconds");

        startTime = System.nanoTime();
        quickSortString.sort(smallWords, 0, smallWords.getSize() - 1);
        endTime = System.nanoTime();
        System.out.println("QuickSort (small words): " + (endTime - startTime) + " nanoseconds");

        startTime = System.nanoTime();
        mergeSortString.sort(mediumWords, 0, mediumWords.getSize() - 1);
        endTime = System.nanoTime();
        System.out.println("MergeSort (medium words): " + (endTime - startTime) + " nanoseconds");

        startTime = System.nanoTime();
        heapSortString.sort(largeWords);
        endTime = System.nanoTime();
        System.out.println("HeapSort (large words): " + (endTime - startTime) + " nanoseconds");

        // Ordenar las listas con cada algoritmo de ordenamiento y medir el tiempo de ejecución
        startTime = System.nanoTime();
        quickSort.sort(orderedNumbers, 0, orderedNumbers.getSize() - 1);
        endTime = System.nanoTime();
        System.out.println("QuickSort (ordered numbers): " + (endTime - startTime) + " nanoseconds");

        startTime = System.nanoTime();
        quickSort.sort(reversedNumbers, 0, reversedNumbers.getSize() - 1);
        endTime = System.nanoTime();
        System.out.println("QuickSort (reversed numbers): " + (endTime - startTime) + " nanoseconds");

        startTime = System.nanoTime();
        quickSort.sort(randomNumbers, 0, randomNumbers.getSize() - 1);
        endTime = System.nanoTime();
        System.out.println("QuickSort (random numbers): " + (endTime - startTime) + " nanoseconds");

        startTime = System.nanoTime();
        quickSortString.sort(orderedWords, 0, orderedWords.getSize() - 1);
        endTime = System.nanoTime();
        System.out.println("QuickSort (ordered words): " + (endTime - startTime) + " nanoseconds");

        startTime = System.nanoTime();
        quickSortString.sort(reversedWords, 0, reversedWords.getSize() - 1);
        endTime = System.nanoTime();
        System.out.println("QuickSort (reversed words): " + (endTime - startTime) + " nanoseconds");

        startTime = System.nanoTime();
        quickSortString.sort(randomWords, 0, randomWords.getSize() - 1);
        endTime = System.nanoTime();
        System.out.println("QuickSort (random words): " + (endTime - startTime) + " nanoseconds");
    }
}