package dsaaj.sort;

import java.util.Arrays;

/**
 * Created by milabobo on 1:10 PM.
 * Email mailto:milabobo@126.com
 */
public class MergeSort implements ISortMethod {
    @Override
    public void sort(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }

        mergeSort(new int[array.length], array, 0, array.length - 1);
    }

    private static void mergeSort(int[] temp, int[] array, int from, int end) {
        if (from >= end) {
            return;
        }

        int middle = (from + end) / 2;
        mergeSort(temp, array, from, middle);
        mergeSort(temp, array, middle + 1, end);
        merge(temp, array, from, end);
    }

    private static void merge(int[] temp, int[] array, int from, int end) {
        int middle = (from + end) / 2;
        int start = from;
        int to = middle + 1;
        int k = from;
        while (start <= middle && to <= end) {
            while (start <= middle && to <= end && array[start] < array[to]) {
                temp[k++] = array[start];
                start++;
            }
            while (start <= middle && to <= end && array[to] <= array[start]) {
                temp[k++] = array[to];
                to++;
            }
        }

        while (start <= middle) {
            temp[k++] = array[start++];
        }

        while (to <= end) {
            temp[k++] = array[to++];
        }

        for (int i = from; i <= end; i++) {
            array[i] = temp[i];
        }
    }
}
