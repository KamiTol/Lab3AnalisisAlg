package org.example.Sorts;

import org.example.Util.Array;

public class HeapSort<T extends Comparable<T>> {
    public void sort(Array<T> array) {
        int n = array.getSize();

        // Construir el montículo (reorganizar el array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(array, n, i);

        // Extraer un elemento uno por uno del montículo
        for (int i = n - 1; i >= 0; i--) {
            // Mover la raíz actual al final
            T temp = array.getElement(0);
            array.setElement(0, array.getElement(i));
            array.setElement(i, temp);

            // Llamar a max heapify en el montículo reducido
            heapify(array, i, 0);
        }
    }

    // Para hacer el montículo de un subarray de array con nodo i
    void heapify(Array<T> array, int n, int i) {
        int largest = i; // Inicializar el más grande como raíz
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // Si el hijo izquierdo es más grande que la raíz
        if (left < n && array.getElement(left).compareTo(array.getElement(largest)) > 0)
            largest = left;

        // Si el hijo derecho es más grande que el más grande hasta ahora
        if (right < n && array.getElement(right).compareTo(array.getElement(largest)) > 0)
            largest = right;

        // Si el más grande no es la raíz
        if (largest != i) {
            T swap = array.getElement(i);
            array.setElement(i, array.getElement(largest));
            array.setElement(largest, swap);

            // Recursivamente hacer el montículo del subarray afectado
            heapify(array, n, largest);
        }
    }
}