package dsaaj.sort;

/**
 * Created by milabobo on 12:15 PM.
 * Email mailto:milabobo@126.com
 */
public class QuickSort implements ISortMethod {
    @Override
    public void sort(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }

        quickSort(array, 0, array.length - 1);
    }

    private void quickSort(int[] array, int from, int end) {
        if (from < 0 || end > array.length - 1 || from >= end) {
            return;
        }
        int pivot = findPivot(array, from, end);

        // partition by pivot
        int i = from, j = end - 1;
        while (i < j) {
            while (i < j && array[i] < pivot) { i++; }
            while (i < j && array[j] > pivot) { j--; }
            Utils.swap(array, i, j);
        }
        Utils.swap(array, i, end);
        quickSort(array, from, i - 1);
        quickSort(array, i + 1, end);
    }

    // choose a pivot the middle of from, end and (from + end) / 2
    // and place them from, end, middle
    private int findPivot(int[] array, int from, int end) {
        int middle = (from + end) / 2;
        if (array[from] > array[middle]) {
            Utils.swap(array, from, middle);
        }

        if (array[middle] > array[end]) {
            Utils.swap(array, end, middle);
        }

        if (array[from] > array[middle]) {
            Utils.swap(array, from, middle);
        }

        int value = array[middle];
        Utils.swap(array, middle, end);
        // middle is placed in the end
        return value;
    }
}
