package dsaa.c3;

/**
 * Created by yu.tian on 下午4:45.
 * Email mailto:tianyu1@le.com.
 */
public interface MyList<T> extends MyCollection<T> {
    T get(int i);
    T set(int i, T t);
    T remove(int i);
    void add(int i, T t);
}
