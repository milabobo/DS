package dsaaj.c3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by yu.tian on 下午6:08.
 * Email mailto:tianyu1@le.com.
 */
class MyLinkedListDequeTest {
    @Test
    void deque() {
        MyLinkedListDeque<String> a = new MyLinkedListDeque<String>();
        a.addFirst("b");
        a.addLast("m");
        a.addLast("c");
        a.offerFirst("p");
        a.offerFirst("q");
        a.offerLast("r");
        a.offerLast("s"); // {q, p, b, m, c, r, s}
        assertEquals("q", a.getFirst());
        assertEquals("s", a.getLast());
        assertEquals("q", a.peekFirst());
        assertEquals("s", a.peekLast());
        print(a);
        assertEquals("q", a.removeFirst());
        assertEquals("s", a.removeLast());
        print(a);
        assertEquals("p", a.pollFirst());
        assertEquals("r", a.pollLast());
        print(a); // {b, m, c}
        System.out.println(a);; // {e, f, g}
    }

    static void print(MyLinkedListDeque<String> a) {
        System.out.println(a);
    }

}