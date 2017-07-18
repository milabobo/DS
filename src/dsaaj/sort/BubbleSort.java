package dsaaj.sort;

/**
 * Created by milabobo on 6:08 PM.
 * Email mailto:milabobo@126.com
 */
public class BubbleSort implements ISortMethod {

    @Override
    public void sort(int[] array) {
        int length = array.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    Utils.swap(array, j, j + 1);
                }
            }
        }
    }

    @Override
    public String getName() {
        return "Bubble";
    }
}
