package sorting.selection;

import sorting.Sort;

/**
 * Time: Θ(n2)
 * Memory: 1
 * Stable: no
 */

public class SelectionSort implements Sort {

    @Override
    public void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minElementIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minElementIndex]) {
                    minElementIndex = j;
                }
            }

            swap(array, minElementIndex, i);
        }
    }

}
