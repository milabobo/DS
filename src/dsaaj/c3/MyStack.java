package dsaaj.c3;

/**
 * Created by yu.tian on 下午10:52.
 * Email mailto:milabobo@126.com.
 */
public interface MyStack<T> extends MyCollection<T> {

    void push(T t);

    T pop();

    boolean isEmpty();

    T peek();

}
