package dsaaj.c3;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/**
 * Created by yu.tian on 下午10:34.
 * Email mailto:tianyu1@le.com.
 */
public class MyLinkedList<T> implements MyList<T>, MyDeque<T>, MyStack<T> {

    static class Node<T> {
        Node<T> pre;
        T item;
        Node<T> next;

        private Node(Node<T> pre, T item, Node<T> next) {
            this.pre = pre;
            this.item = item;
            this.next = next;
        }
    }

    // first node(with item)
    // first == null && last == null
    // ||
    // first != null && first.pre == null
    private Node<T> first;

    // last node(with item)
    // last == null || first == null
    // ||
    // last != null && last.next == null
    private Node<T> last;

    // total size of this linked list
    private int size;

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public T get(int i) {
        checkRange(i);
        int k = 0;
        Node<T> start = first;
        while (start != null) {
            if (i == k) {
                return start.item;
            }
            start = start.next;
            ++k;
        }
        return null;
    }

    @Override
    public void push(T t) {
        innerAddFirst(t);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T set(int i, T t) {
        checkRange(i);
        int k = 0;
        T oldT = null;
        Node<T> start = first;
        while (start != null) {
            if (i == k) {
                oldT = start.item;
                start.item = t;
            }
            start = start.next;
            ++k;
        }
        return oldT;
    }

    @Override
    public T remove(T t) {
        if (first == null) {
            return null;
        }

        Node<T> next = first;
        Node<T> oldT = null;
        while (next != null) {
            if ((t == null && next.item == null)
                    || (t != null && t.equals(next.item))) {
                oldT = next;
                break;
            }
            next = next.next;
        }
        if (oldT != null) {
            unlinkNode(oldT);
            return oldT.item;
        }
        return null;
    }

    @Override
    public T pop() {
        return innerRemoveFirst();
    }

    @Override
    public void addFirst(T t) {
        innerAddFirst(t);
    }

    @Override
    public T remove(int i) {
        checkRange(i);
        int k = 0;
        Node<T> old = null;
        Node<T> start = first;
        while (start != null) {
            if (i == k) {
                old = start;
                break;
            }
            start = start.next;
            ++k;
        }

        unlinkNode(old);
        return old == null ? null : old.item;
    }

    @Override
    public boolean contains(T t) {
        if (first == null) {
            return false;
        }

        Node<T> next = first;
        while (next != null) {
            if ((t == null && next.item == null) ||
                    (t != null && t.equals(next.item))) {
                return true;
            }
            next = next.next;
        }
        return false;
    }

    @Override
    public void add(int i, T t) {
        checkRange(i);
        int k = 0;
        Node<T> start = first;
        while (start != null) {
            if (i == k) {
                Node<T> newNode = new Node<T>(start.pre, t, start);
                linkNode(newNode);
                return;
            }
            start = start.next;
            ++k;
        }
    }

    @Override
    public void offer(T t) {
        innerAddLast(t);
    }

    @Override
    public boolean add(T t) {
        return innerAddLast(t);
    }

    @Override
    public void clear() {
        Node<T> start = first;
        while (start != null) {
            Node<T> next = start.next;
            start.pre = null;
            start.item = null;
            start.next = null;
            start = next;
        }
        first = last = null;
        size = 0;
    }

    @Override
    public void addLast(T t) {
        innerAddLast(t);
    }

    @Override
    public MyIterator<T> iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements MyIterator<T> {
        int position = 0;
        int innerSize = size;
        int handle = 0;
        Node<T> start = first;
        Node<T> pre;

        @Override
        public boolean hasNext() {
            return start != null;
        }

        @Override
        public T next() {
            checkRange();
            checkModify();
            T t = start.item;
            pre = start;
            start = start.next;

            position++;
            // do not call remove when next not call,
            // and we suggest only call remove once per next
            handle = 1;
            return t;
        }

        @Override
        public void remove() {
            checkHandle();
            checkModify();
            unlinkNode(pre);

            position--;
            innerSize--;
            handle = 0;
        }

        private void checkRange() {
            if (position > size - 1) {
                throw new NoSuchElementException();
            }
        }

        private void checkHandle() {
            if (handle == 0) {
                throw new IllegalStateException();
            }
        }

        private void checkModify() {
            if (innerSize != size) {
                throw new ConcurrentModificationException();
            }
        }
    }

    @Override
    public T remove() {
        return innerRemoveFirst();
    }

    @Override
    public boolean offerFirst(T t) {
        return innerAddFirst(t);
    }

    @Override
    public boolean offerLast(T t) {
        return innerAddLast(t);
    }

    @Override
    public T poll() {
        return innerRemoveFirst();
    }

    @Override
    public T removeFirst() {
        return innerRemoveFirst();
    }

    @Override
    public T element() {
        return innerGetFirst();
    }

    @Override
    public T removeLast() {
        return innerRemoveLast();
    }

    @Override
    public T peek() {
        return innerGetFirst();
    }

    @Override
    public T pollFirst() {
        return innerRemoveFirst();
    }

    @Override
    public T pollLast() {
        return innerRemoveLast();
    }

    @Override
    public T getFirst() {
        return innerGetFirst();
    }

    @Override
    public T getLast() {
        return innerGetLast();
    }

    @Override
    public T peekFirst() {
        return innerGetFirst();
    }

    @Override
    public T peekLast() {
        return innerGetLast();
    }

    private void checkRange(int i) {
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException(
                    String.format("Index is %d, size is %d", i, size));
        }
    }

    private void unlinkNode(Node<T> t) {
        if (t == null) {
            return;
        }

        Node<T> start = t.pre;
        Node<T> end = t.next;
        if (start != null) {
            start.next = end;
        } else {
            first = end;
        }

        if (end != null) {
            end.pre = start;
        } else {
            last = start;
        }
        t.pre = null;
        t.next = null;
        --size;
    }

    private void linkNode(Node<T> t) {
        if (t == null) {
            return;
        }

        Node<T> start = t.pre;
        if (start != null) {
            start.next = t;
        } else {
            first = t;
        }

        Node<T> end = t.next;
        if (end != null) {
            end.pre = t;
        } else {
            last = t;
        }
        ++size;
    }

    private T innerGetFirst() {
        return first == null ? null : first.item;
    }

    private T innerGetLast() {
        return last == null ? null : last.item;
    }

    private T innerRemoveFirst() {
        if (first == null) {
            return null;
        }

        T t = first.item;
        first = first.next;
        if (first == null) {
            last = null;
        } else {
            first.pre = null;
        }
        --size;

        return t;
    }

    private T innerRemoveLast() {
        if (last == null) {
            return null;
        }

        T t = last.item;
        last = last.pre;
        if (last == null) {
            first = null;
        } else {
            last.next = null;
        }
        --size;

        return t;
    }

    private boolean innerAddFirst(T t) {
        Node<T> newNode;
        if (first == null) {
            newNode = new Node<T>(null, t, null);
            first = last = newNode;
            ++size;
            return true;
        }

        newNode = new Node<T>(null, t, first);
        first.pre = newNode;
        first = newNode;
        ++size;
        return true;
    }

    private boolean innerAddLast(T t) {
        Node<T> newNode;
        if (last == null) {
            newNode = new Node<T>(null, t, null);
            first = last = newNode;
            ++size;
            return true;
        }

        newNode = new Node<T>(last, t, null);
        last.next = newNode;
        last = newNode;
        ++size;
        return true;
    }

    // Help class for exercise using
    Node<T> node(int i) {
        checkRange(i);
        int k = 0;
        Node<T> start = first;
        while (start != null) {
            if (i == k) {
                return start;
            }
            start = start.next;
            ++k;
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("{");
        Node<T> start = first;
        while (start != null) {
            builder.append(start.item);
            if (start.next != null) {
                builder.append(",").append(" ");
            }
            start = start.next;
        }
        builder.append("}");
        return builder.toString();
    }
}
