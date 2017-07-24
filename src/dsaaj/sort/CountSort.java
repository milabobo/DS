package dsaaj.sort;

/**
 * Created by milabobo on 2:22 PM.
 * Email mailto:milabobo@126.com
 */
public class CountSort implements ISortMethod {
    @Override
    public void sort(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }

        int[] other = new int[max + 1];
        for (int i = 0; i < array.length; i++) {
            other[array[i]]++;
        }

        int m = 0;
        for (int i = 0; i < other.length; i++) {
            while (other[i]-- > 0) {
                array[m++] = i;
            }
        }
    }
}
