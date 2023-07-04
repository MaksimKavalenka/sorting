package sorting.partitioning;

import sorting.Sort;

/**
 * Time: Ω(n*log(n)), Θ(n*log(n)), O(n2)
 * Memory: 1
 * Stable: no
 */

public class QuickSort implements Sort {

    @Override
    public void sort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);

            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    private int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int leastSmallElementIndex = low - 1;

        for (int i = low; i < high; i++) {
            if (array[i] < pivot) {
                leastSmallElementIndex++;

                if (leastSmallElementIndex != i) {
                    swap(array, leastSmallElementIndex, i);
                }
            }
        }

        leastSmallElementIndex++;
        swap(array, leastSmallElementIndex, high);

        return leastSmallElementIndex;
    }

}
