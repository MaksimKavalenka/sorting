package sorting;

import java.util.Arrays;

public interface Sort {

    int[] ARRAY = { 984, 42, 681, 996, 215, 968, 736, 915, 192, 1, 823, 777, 596, 916, 0, 143, 4, 824, 174, 506, 350, 853, 693, 931, 992, 788, 806, 899, 362, 848, 758, 701, 236, 562, 652, 964, 257, 621, 303, 654, 162, 928, 844, 112, 229, 716, 764, 653, 805, 143, 716, 783, 757, 876, 413, 314, 189, 21, 917, 649, 700, 199, 555, 49, 701, 287, 347, 805, 90, 984, 48, 650, 319, 180, 963, 335, 305, 920, 726, 307, 403, 29, 935, 706, 737, 982, 927, 258, 298, 751, 659, 807, 906, 43, 236, 753, 967, 240, 355, 181 };

    default int[] getArray() {
        return Arrays.copyOf(ARRAY, ARRAY.length);
    }

    default void swap(int[] array, int from, int to) {
        int swap = array[to];
        array[to] = array[from];
        array[from] = swap;
    }

    default void templateSort() {
        int[] array = getArray();
        sort(array);

        System.out.println(this.getClass().getSimpleName());
        System.out.println(Arrays.toString(array));
        System.out.println();
    }

    void sort(int[] array);

}
