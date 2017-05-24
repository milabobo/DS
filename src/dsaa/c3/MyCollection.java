package dsaa.c3;

/**
 * Created by yu.tian on 下午4:39.
 * Email mailto:tianyu1@le.com.
 */
public interface MyCollection<T> {
    boolean isEmpty();
    int size();
    T remove(T t);
    boolean contains(T t);
    boolean add(T t);
    void clear();
    MyIterator<T> iterator();
}
