package dsaaj.c3;

/**
 * Created by yu.tian on 上午10:52.
 * Email mailto:milabobo@126.com.
 *
 * E3.11
 */
public class MySLinkedList<T> {
    // keep only first pointer
    SNode<T> first;
    int size;

    private static class SNode<T> {
        T item;
        SNode<T> next;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("{");
        SNode<T> start = first;
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
