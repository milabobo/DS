package dsaaj.sort;

/**
 * Created by milabobo on 11:48 AM.
 * Email mailto:milabobo@126.com
 */
public class SelectionSort implements ISortMethod {
    @Override
    public void sort(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }

        for (int i = 0; i < array.length; i++) {
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[index] > array[j]) {
                    index = j;
                }
            }

            if (array[i] != array[index]) {
                Utils.swap(array, i, index);
            }
        }
    }
}
