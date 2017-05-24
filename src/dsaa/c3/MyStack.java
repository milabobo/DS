package dsaa.c3;

/**
 * Created by yu.tian on 下午10:52.
 * Email mailto:tianyu1@le.com.
 */
public interface MyStack<T> extends MyCollection<T> {

    void push(T t);

    T pop();

    boolean isEmpty();

    T peek();

}
