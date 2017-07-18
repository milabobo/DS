package dsaaj.sort;

/**
 * Created by milabobo on 6:06 PM.
 * Email mailto:milabobo@126.com
 */
public class Main {
    public static void main(String[] args) {
        int[] array = {7, 4, 6, 9, 1, 8, 0, 2, 3, 5, 10};
        SortStrategy sortStrategy = new SortStrategy(array);
        sortStrategy.sort(new BubbleSort());
    }
}
