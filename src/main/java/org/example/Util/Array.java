package org.example.Util;

public class Array {
    private int[] array;
    private int size;

    public Array(int size) {
        this.size = size;
        this.array = new int[size];
    }

    public void setElement(int index, int value) {
        if (index >= 0 && index < size) {
            array[index] = value;
        } else {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds!");
        }
    }

    public int getElement(int index) {
        if (index >= 0 && index < size) {
            return array[index];
        } else {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds!");
        }
    }

    public int getSize() {
        return size;
    }

    public int[] getArray() {
        return array;
    }
}