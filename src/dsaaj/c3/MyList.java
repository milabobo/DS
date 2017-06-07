package dsaaj.c3;

/**
 * Created by yu.tian on 下午4:45.
 * Email mailto:milabobo@126.com.
 */
public interface MyList<T> extends MyCollection<T> {
    T get(int i);
    T set(int i, T t);
    T remove(int i);
    void add(int i, T t);
}
