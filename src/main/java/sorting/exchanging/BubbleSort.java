package sorting.exchanging;

import sorting.Sort;

/**
 * Time: Ω(n), Θ(n2), O(n2)
 * Memory: 1
 * Stable: yes
 */

public class BubbleSort implements Sort {

    @Override
    public void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

}
