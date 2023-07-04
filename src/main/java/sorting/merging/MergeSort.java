package sorting.merging;

import sorting.Sort;

/**
 * Time: Θ(n*log(n))
 * Memory: n
 * Stable: yes
 */

public class MergeSort implements Sort {

    @Override
    public void sort(int[] array) {
        mergeSort(array, 0, array.length - 1);
    }

    private void mergeSort(int[] array, int low, int high) {
        if (low < high) {
            int middle = low + (high - low) / 2;

            mergeSort(array, low, middle);
            mergeSort(array, middle + 1, high);

            merge(array, low, middle, high);
        }
    }

    private void merge(int[] array, int low, int middle, int high) {
        int leftArraySize = middle - low + 1;
        int rightArraySize = high - middle;

        int[] leftArray = new int[leftArraySize];
        int[] rightArray = new int[rightArraySize];

        for (int i = 0; i < leftArraySize; i++) {
            leftArray[i] = array[low + i];
        }

        for (int i = 0; i < rightArraySize; i++) {
            rightArray[i] = array[middle + 1 + i];
        }

        int i = 0, j = 0, k = low;

        while (i < leftArraySize && j < rightArraySize) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }

            k++;
        }

        for (; i < leftArraySize; i++, k++) {
            array[k] = leftArray[i];
        }

        for (; j < rightArraySize; j++, k++) {
            array[k] = rightArray[j];
        }
    }

}
