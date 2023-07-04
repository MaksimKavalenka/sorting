package sorting.insertion;

import sorting.Sort;

/**
 * Time: Ω(n), Θ(n2), O(n2)
 * Memory: 1
 * Stable: yes
 */

public class InsertionSort implements Sort {

    @Override
    public void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    swap(array, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

}
