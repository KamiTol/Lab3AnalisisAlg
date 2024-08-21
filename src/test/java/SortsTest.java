
import org.example.Sorts.HeapSort;
import org.example.Sorts.MergeSort;
import org.example.Sorts.QuickSort;
import org.example.Util.Array;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortsTest {

    @Test
    public void heapSortShouldSortArrayCorrectly() {
        Array array = new Array(5);
        array.setElement(0, 5);
        array.setElement(1, 3);
        array.setElement(2, 1);
        array.setElement(3, 4);
        array.setElement(4, 2);

        HeapSort heapSort = new HeapSort();
        heapSort.sort(array);

        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array.getArray());
    }

    @Test
    public void mergeSortShouldSortArrayCorrectly() {
        Array array = new Array(5);
        array.setElement(0, 5);
        array.setElement(1, 3);
        array.setElement(2, 1);
        array.setElement(3, 4);
        array.setElement(4, 2);

        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(array, 0, array.getSize() - 1);

        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array.getArray());
    }

    @Test
    public void quickSortShouldSortArrayCorrectly() {
        Array array = new Array(5);
        array.setElement(0, 5);
        array.setElement(1, 3);
        array.setElement(2, 1);
        array.setElement(3, 4);
        array.setElement(4, 2);

        QuickSort quickSort = new QuickSort();
        quickSort.sort(array, 0, array.getSize() - 1);

        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array.getArray());
    }

    @Test
    public void sortEmptyArrayShouldNotFail() {
        Array array = new Array(0);

        HeapSort heapSort = new HeapSort();
        heapSort.sort(array);
        assertArrayEquals(new int[]{}, array.getArray());

        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(array, 0, array.getSize() - 1);
        assertArrayEquals(new int[]{}, array.getArray());

        QuickSort quickSort = new QuickSort();
        quickSort.sort(array, 0, array.getSize() - 1);
        assertArrayEquals(new int[]{}, array.getArray());
    }

    @Test
    public void sortSingleElementArrayShouldNotChangeArray() {
        Array array = new Array(1);
        array.setElement(0, 5);

        HeapSort heapSort = new HeapSort();
        heapSort.sort(array);
        assertArrayEquals(new int[]{5}, array.getArray());

        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(array, 0, array.getSize() - 1);
        assertArrayEquals(new int[]{5}, array.getArray());

        QuickSort quickSort = new QuickSort();
        quickSort.sort(array, 0, array.getSize() - 1);
        assertArrayEquals(new int[]{5}, array.getArray());
    }
}