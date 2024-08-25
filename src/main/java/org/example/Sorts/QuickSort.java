package org.example.Sorts;

import org.example.Util.Array;

public class QuickSort<T extends Comparable<T>> {
    // Método para ordenar el array
    public void sort(Array<T> array, int low, int high) {
        if (low < high) {
            // Encuentra el punto de partición
            int pi = partition(array, low, high);

            // Ordena recursivamente las dos mitades
            sort(array, low, pi - 1);
            sort(array, pi + 1, high);
        }
    }

    // Método para particionar el array
    int partition(Array<T> array, int low, int high) {
        // Elige el último elemento como pivote
        T pivot = array.getElement(high);

        // Índice del elemento más pequeño
        int i = (low - 1);

        // Recorre el array
        for (int j = low; j < high; j++) {
            // Si el elemento actual es menor que el pivote
            if (array.getElement(j).compareTo(pivot) < 0) {
                i++;

                // Intercambia array[i] y array[j]
                T temp = array.getElement(i);
                array.setElement(i, array.getElement(j));
                array.setElement(j, temp);
            }
        }

        // Intercambia array[i+1] y array[high] (o pivote)
        T temp = array.getElement(i + 1);
        array.setElement(i + 1, array.getElement(high));
        array.setElement(high, temp);

        return i + 1;
    }
}