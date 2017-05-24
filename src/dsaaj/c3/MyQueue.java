package dsaaj.c3;

/**
 * Created by yu.tian on 下午10:34.
 * Email mailto:tianyu1@le.com.
 */
public interface MyQueue<T> extends MyCollection<T> {
    // throw exception if space is full
    boolean add(T t);

    void offer(T t);

    // throw exception if space is 0
    T remove();

    // retrive and remove
    T poll();

    // do no remove, throw exception if space is 0
    T element();

    // do not remove
    T peek();

}
