package dsaaj.sort;

/**
 * Created by milabobo on 11:49 AM.
 * Email mailto:milabobo@126.com
 */
public class InsertionSort implements ISortMethod {
    @Override
    public void sort(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }

        for (int i = 1; i < array.length; i++) {
            // choose a value
            int a = array[i];

            // find position to insert
            int target = i;
            for (int j = 0; j <= i - 1; j++) {
                if (array[j] > a) {
                    target = j;
                    break;
                }
            }

            // shift from target to i
            for (int j = i - 1; j >= target; j--) {
                array[j + 1] = array[j];
            }

            array[target] = a;
        }
    }
}
