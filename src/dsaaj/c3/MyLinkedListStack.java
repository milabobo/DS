package dsaaj.c3;

/**
 * Created by yu.tian on 下午6:01.
 * Email mailto:tianyu1@le.com.
 */
public class MyLinkedListStack<T> implements MyStack<T> {
    private MyLinkedList<T> list = new MyLinkedList<T>();

    @Override
    public void push(T t) {
        list.push(t);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public T remove(T t) {
        return list.remove(t);
    }

    @Override
    public T pop() {
        return list.pop();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public boolean contains(T t) {
        return list.contains(t);
    }

    @Override
    public T peek() {
        return list.peek();
    }

    @Override
    public boolean add(T t) {
        return list.add(t);
    }

    @Override
    public void clear() {
        list.clear();
    }

    @Override
    public MyIterator<T> iterator() {
        return list.iterator();
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
