package sorting;

import sorting.exchanging.BubbleSort;
import sorting.insertion.InsertionSort;
import sorting.merging.MergeSort;
import sorting.partitioning.QuickSort;
import sorting.selection.HeapSort;
import sorting.selection.SelectionSort;

public class MainSort {

    public static void main(String[] args) {
        Sort sort = new BubbleSort();
        sort.templateSort();

        sort = new SelectionSort();
        sort.templateSort();

        sort = new InsertionSort();
        sort.templateSort();

        sort = new QuickSort();
        sort.templateSort();

        sort = new MergeSort();
        sort.templateSort();

        sort = new HeapSort();
        sort.templateSort();
    }

}
