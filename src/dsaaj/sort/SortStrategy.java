package dsaaj.sort;

import java.util.Arrays;

/**
 * Created by milabobo on 6:03 PM.
 * Email mailto:milabobo@126.com
 */
public class SortStrategy {
    final int[] array;

    public SortStrategy(int[] array) {
        this.array = array;
    }

    void sort(ISortMethod method) {
        System.out.println("Sort by " + method.getName());
        method.sort(array);
        System.out.println("Result " + Arrays.toString(array));
    }
}
