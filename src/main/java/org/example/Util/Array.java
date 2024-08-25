package org.example.Util;

public class Array<T extends Comparable<T>> {
    private T[] array;
    private int size;

    public Array(int size) {
        this.size = size;
        this.array = (T[]) new Comparable[size];
    }

    public void setElement(int index, T value) {
        if (index >= 0 && index < size) {
            array[index] = value;
        } else {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds!");
        }
    }

    public T getElement(int index) {
        if (index >= 0 && index < size) {
            return array[index];
        } else {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds!");
        }
    }

    public int getSize() {
        return size;
    }

    public T[] getArray() {
        return array;
    }
}