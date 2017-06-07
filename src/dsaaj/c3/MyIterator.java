package dsaaj.c3;

/**
 * Created by yu.tian on 下午4:38.
 * Email mailto:milabobo@126.com.
 */
public interface MyIterator<T> {
    boolean hasNext();
    T next();
    void remove();
}
