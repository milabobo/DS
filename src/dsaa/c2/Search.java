package dsaa.c2;

/**
 * Created by yu.tian on 下午8:25.
 * Email mailto:tianyu1@le.com.
 */
public class Search {
    static int binarySearch(int a[], int v) {
        if (a == null || a.length == 0) {
            throw new IllegalArgumentException("array is illegal");
        }

        int low = 0;
        int high = a.length - 1;
        int middle;
        while (low <= high) {
            middle = (low + high) / 2;
            if (v > a[middle]) {
                low = middle + 1;
            } else if (v < a[middle]) {
                high = middle - 1;
            } else {
                return middle;
            }
        }

        return ~low;
    }

    // From java.utils.Arrays
    static int binarySearch0(int[] a, int key) {
        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = a[mid];

            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid; // key found
        }
        return -(low + 1);  // key not found.
    }
}
