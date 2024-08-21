package org.example.Sorts;

import org.example.Util.Array;

public class QuickSort {
    public void sort(Array array, int low, int high) {
        if (low < high) {
            /* pi es el índice de particionamiento, arr[pi] está ahora
               en el lugar correcto */
            int pi = partition(array, low, high);

            // Ordenar recursivamente los elementos antes
            // y después de la partición
            sort(array, low, pi - 1);
            sort(array, pi + 1, high);
        }
    }

    int partition(Array array, int low, int high) {
        int pivot = array.getElement(high);
        int i = (low - 1); // Índice del elemento más pequeño
        for (int j = low; j < high; j++) {
            // Si el elemento actual es más pequeño que el pivote
            if (array.getElement(j) < pivot) {
                i++;

                // Intercambiar arr[i] y arr[j]
                int temp = array.getElement(i);
                array.setElement(i, array.getElement(j));
                array.setElement(j, temp);
            }
        }

        // Intercambiar arr[i+1] y arr[high] (o pivote)
        int temp = array.getElement(i + 1);
        array.setElement(i + 1, array.getElement(high));
        array.setElement(high, temp);

        return i + 1;
    }
}
