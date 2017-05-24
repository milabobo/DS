package dsaa.c3;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/**
 * Created by yu.tian on 下午5:13.
 * Email mailto:tianyu1@le.com.
 */
public class MyArrayList<T> implements MyList<T> {
    private int size;
    private Object[] element;
    private static int INIT_CAPACITY = MyArrayUtils.INIT_CAPACITY;

    public MyArrayList() {
        this(INIT_CAPACITY);
    }

    public MyArrayList(int cap) {
        cap = Math.min(cap, INIT_CAPACITY);
        element = new Object[cap];
    }

    public MyArrayList(MyArrayList<T> otherList) {
        this.size = otherList.size;
        element = new Object[otherList.element.length];
        for (int i = 0; i < size; i++) {
            element[i] = otherList.element[i];
        }
    }

    @SuppressWarnings("unchecked")
    T elementData(int i) {
        return (T) element[i];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public T get(int i) {
        checkRange(i);
        return elementData(i);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T set(int i, T t) {
        checkRange(i);
        T removed = elementData(i);
        element[i] = t;
        return removed;
    }

    @Override
    public T remove(T t) {
        if (t == null) {
            return null;
        }

        int index = -1;
        T removed = null;
        for (int i = 0; i < size; i++) {
            if (t.equals(elementData(i))) {
                removed = elementData(i);
                index = i;
            }
        }
        if (index >= 0) {
            for (int j = index; j < size; j++) {
                if (j + 1 == size) {
                    element[j] = null;
                    break;
                }
                element[j] = element[j + 1];
            }
            --size;
        }

        ensureCapacity();
        return removed;
    }

    @Override
    public T remove(int i) {
        checkRange(i);

        T t = elementData(i);
        for (int j = i; j < size; j++) {
            if (j + 1 == size) {
                element[j] = null;
                break;
            }
            element[j] = element[j + 1];
        }
        --size;
        ensureCapacity();
        return t;
    }

    @Override
    public boolean contains(T t) {
        if (t == null) {
            return false;
        }

        for (int i = 0; i < size; i++) {
            if (t.equals(elementData(i))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void add(int i, T t) {
        checkRange(i);

        ensureCapacity();
        for (int j = size; j > i; j--) {
            element[j] = element[j - 1];
        }
        element[i] = t;
        size++;
    }

    @Override
    public boolean add(T t) {
        ensureCapacity();
        element[size++] = t;
        return true;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            element[i] = null;
        }
        size = 0;
        ensureCapacity();
    }

    @Override
    public MyIterator<T> iterator() {
        return new ArrayIterator();
    }

    private class ArrayIterator implements MyIterator<T> {
        int position = 0;
        int innerSize = size;
        int handle = 0;

        @Override
        public boolean hasNext() {
            return position < size;
        }

        @Override
        public T next() {
            checkRange();
            checkModify();
            T t = elementData(position++);
            // do not call remove when next not call,
            // and we suggest only call remove once per next
            handle = 1;
            return t;
        }

        @Override
        public void remove() {
            checkHandle();
            checkModify();
            MyArrayList.this.remove(--position);
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

    private void ensureCapacity() {
        element = MyArrayUtils.ensureSize(element, size);
    }

    private void checkRange(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException(
                    String.format("Index is %d, size is %d", i, size));
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("{");
        for (int i = 0; i < size; i++) {
            builder.append(elementData(i));
            if (i != size - 1) {
                builder.append(", ");
            }
        }
        builder.append("}");
        return builder.toString();
    }
}
