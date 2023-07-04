package sorting.selection;

import sorting.Sort;

/**
 * Time: Θ(n*log(n))
 * Memory: 1
 * Stable: no
 */

public class HeapSort implements Sort {

    @Override
    public void sort(int[] array) {
        for (int i = array.length / 2 - 1; i >= 0; i--) {
            heapify(array, array.length - 1, i);
        }

        for (int i = array.length - 1; i > 0; i--) {
            swap(array, 0, i);
            heapify(array, i, 0);
        }
    }

    private void heapify(int[] array, int high, int top) {
        int largestElementIndex = top;

        int leftChildIndex = top * 2 + 1;
        int rightChildIndex = top * 2 + 2;

        if (leftChildIndex < high && array[leftChildIndex] > array[largestElementIndex]) {
            largestElementIndex = leftChildIndex;
        }

        if (rightChildIndex < high && array[rightChildIndex] > array[largestElementIndex]) {
            largestElementIndex = rightChildIndex;
        }

        if (largestElementIndex != top) {
            swap(array, top, largestElementIndex);
            heapify(array, high, largestElementIndex);
        }
    }

}
