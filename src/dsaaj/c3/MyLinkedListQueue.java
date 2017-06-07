package dsaaj.c3;

/**
 * Created by yu.tian on 下午6:12.
 * Email mailto:milabobo@126.com.
 */
public class MyLinkedListQueue<T> implements MyQueue<T> {
    private MyLinkedList<T> list = new MyLinkedList<T>();

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
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
    public boolean contains(T t) {
        return list.contains(t);
    }

    @Override
    public boolean add(T t) {
        return list.add(t);
    }

    @Override
    public void offer(T t) {
        list.offer(t);
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
    public T remove() {
        return list.remove();
    }

    @Override
    public T poll() {
        return list.poll();
    }

    @Override
    public T element() {
        return list.element();
    }

    @Override
    public T peek() {
        return list.peek();
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
