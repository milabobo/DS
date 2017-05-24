package dsaaj.c1;

/**
 * Created by yu.tian on 下午1:46.
 * Email mailto:tianyu1@le.com.
 *
 * Find k's max value in an array
 */
public class KMax {

    enum Multiply {
        DESC, ASC
    }

    public static int kMax(int[] value, int k) {
        if (value == null || value.length == 0
                || k < 1 || k > value.length) {
            throw new IllegalArgumentException(
                    "value and k not match condition");
        }

        // if k > value.length / 2, that is value.length - k + 1 min
        if (k > value.length / 2) {
            return kMin(value, value.length - k + 1);
        }

        int[] kMax = new int[k];
        for (int i = 0; i < k; i++) {
            kMax[i] = value[i];
        }
        // sort kMax value using bubble sort acceding
        sortArray(kMax, Multiply.ASC);

        // for value array, check the other values
        for (int i = k; i < value.length; i++) {
            replaceKMaxValue(kMax, value[i]);
        }

        return kMax[0];
    }

    public static int kMin(int[] value, int k) {
        if (value == null || value.length == 0
                || k < 1 || k > value.length) {
            throw new IllegalArgumentException(
                    "value and k not match condition");
        }

        int[] kMin = new int[k];
        for (int i = 0; i < k; i++) {
            kMin[i] = value[i];
        }
        // sort kMax value using bubble sort acceding
        sortArray(kMin, Multiply.DESC);

        // for value array, check the other values
        for (int i = k; i < value.length; i++) {
            replaceKMinValue(kMin, value[i]);
        }

        return kMin[0];
    }

    public static void sortArray(int[] value, Multiply multiply) {
        int length = value.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (multiply == Multiply.ASC ?
                        value[j] > value[j + 1] :
                        value[j] < value[j + 1]) {
                    int temp = value[j + 1];
                    value[j + 1] = value[j];
                    value[j] = temp;
                }
            }
        }
    }

    public static void replaceKMaxValue(int[] a, int v) {
        if (a[0] > v) {
            return;
        } else if (a.length == 1) {
            a[0] = v;
            return;
        }

        for (int i = 1; i < a.length; i++) {
            if (v <= a[i]) {
                a[i - 1] = v;
                break;
            }

            a[i - 1] = a[i];
            if (a.length - 1 == i) {
                a[i] = v;
            }
        }
    }

    public static void replaceKMinValue(int[] a, int v) {
        if (a[0] < v) {
            return;
        } else if (a.length == 1) {
            a[0] = v;
            return;
        }

        for (int i = 1; i < a.length; i++) {
            if (v >= a[i]) {
                a[i - 1] = v;
                break;
            }

            a[i - 1] = a[i];
            if (a.length - 1 == i) {
                a[i] = v;
            }
        }
    }

}
