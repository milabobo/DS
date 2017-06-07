package dsaaj.c3;

/**
 * Created by yu.tian on 下午4:24.
 * Email mailto:milabobo@126.com.
 */
public class MyArrayUtils {
    public static int INIT_CAPACITY = 6;
    private static final float FACTOR = 0.75f;

    static Object[] ensureSize(Object[] array, int dataSize) {
        int size = array.length;
        if (dataSize == size) {
            array = enlargeArray(array, dataSize,
                    Math.max(INIT_CAPACITY, dataSize * 2));
        } else if (dataSize == size / 2) {
            array = enSmallArray(array, dataSize,
                    Math.max(INIT_CAPACITY, (int)(size * FACTOR)));
        }

        return array;
    }

    static Object[] enlargeArray(Object[] array, int dataSize, int newLength) {
        Object[] a = new Object[newLength];
        for (int i = 0; i < dataSize; i++) {
            a[i] = array[i];
        }
        return a;
    }

    static Object[] enSmallArray(Object[] array, int dataSize, int newLength) {
        Object[] a = new Object[newLength];
        for (int i = 0; i < dataSize; i++) {
            a[i] = array[i];
        }
        return a;
    }

}
