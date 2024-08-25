package org.example.Sorts;

import org.example.Util.Array;

public class MergeSort<T extends Comparable<T>> {
    public void sort(Array<T> array, int left, int right) {
        if (left < right) {
            // Encontrar el punto medio del array
            int mid = (left + right) / 2;

            // Ordenar las dos mitades
            sort(array, left, mid);
            sort(array, mid + 1, right);

            // Fusionar las mitades ordenadas
            merge(array, left, mid, right);
        }
    }

    void merge(Array<T> array, int left, int mid, int right) {
        // Encontrar los tamaños de los dos subarrays para fusionar
        int n1 = mid - left + 1;
        int n2 = right - mid;

        /* Crear arrays temporales */
        T L[] = (T[]) new Comparable[n1];
        T R[] = (T[]) new Comparable[n2];

        /* Copiar los datos a los arrays temporales */
        for (int i = 0; i < n1; ++i)
            L[i] = array.getElement(left + i);
        for (int j = 0; j < n2; ++j)
            R[j] = array.getElement(mid + 1 + j);

        /* Fusionar los arrays temporales */

        // Índices iniciales del primer y segundo subarray
        int i = 0, j = 0;

        // Índice inicial del subarray fusionado
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i].compareTo(R[j]) <= 0) {
                array.setElement(k, L[i]);
                i++;
            } else {
                array.setElement(k, R[j]);
                j++;
            }
            k++;
        }

        /* Copiar los elementos restantes de L[], si hay */
        while (i < n1) {
            array.setElement(k, L[i]);
            i++;
            k++;
        }

        /* Copiar los elementos restantes de R[], si hay */
        while (j < n2) {
            array.setElement(k, R[j]);
            j++;
            k++;
        }
    }
}