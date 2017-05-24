package dsaa.c3;

/**
 * Created by yu.tian on 下午10:37.
 * Email mailto:tianyu1@le.com.
 */
public interface MyDeque<T> extends MyQueue<T> {
    // throw exception if space full
    void addFirst(T t);

    // throw exception if space full
    void addLast(T t);

    boolean offerFirst(T t);

    boolean offerLast(T t);

    // throw exception if space 0
    T removeFirst();

    // throw exception if space full
    T removeLast();

    T pollFirst();

    T pollLast();

    // throw exception if space 0
    T getFirst();

    // throw exception if space full
    T getLast();

    T peekFirst();

    T peekLast();
}
