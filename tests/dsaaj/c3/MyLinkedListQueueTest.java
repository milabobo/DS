package dsaaj.c3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by yu.tian on 下午6:15.
 * Email mailto:milabobo@126.com.
 */
class MyLinkedListQueueTest {
    @Test
    void queue() {
        MyLinkedListQueue<String> a = new MyLinkedListQueue<String>();
        a.add("c");
        a.offer("d");
        a.offer("e");
        a.add("f");
        a.add("g");
        assertEquals("c", a.peek());
        assertEquals("c", a.element());
        assertEquals("c", a.poll());
        assertEquals("d", a.remove());
        print(a); // {e, f, g}
    }

    static void print(MyLinkedListQueue<String> a) {
        System.out.println(a);
    }

}