package dsaaj.sort;

/**
 * Created by milabobo on 6:02 PM.
 * Email mailto:milabobo@126.com
 */
public interface ISortMethod {
    void sort(int[] array);
    default String getName() {
        return getClass().getSimpleName();
    }
}
