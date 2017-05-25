package dsaaj.c3;

/**
 * Created by yu.tian on 下午6:05.
 * Email mailto:tianyu1@le.com.
 */
public class MyLinkedListDeque<T> implements MyDeque<T> {
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
    public void addFirst(T t) {
        list.addFirst(t);
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
    public void addLast(T t) {
        list.addLast(t);
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
    public boolean offerFirst(T t) {
        return list.offerFirst(t);
    }

    @Override
    public boolean offerLast(T t) {
        return list.offerLast(t);
    }

    @Override
    public T poll() {
        return list.poll();
    }

    @Override
    public T removeFirst() {
        return list.removeFirst();
    }

    @Override
    public T element() {
        return list.element();
    }

    @Override
    public T removeLast() {
        return list.removeLast();
    }

    @Override
    public T peek() {
        return list.peek();
    }

    @Override
    public T pollFirst() {
        return list.pollFirst();
    }

    @Override
    public T pollLast() {
        return list.pollLast();
    }

    @Override
    public T getFirst() {
        return list.getFirst();
    }

    @Override
    public T getLast() {
        return list.getLast();
    }

    @Override
    public T peekFirst() {
        return list.peekFirst();
    }

    @Override
    public T peekLast() {
        return list.peekLast();
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
