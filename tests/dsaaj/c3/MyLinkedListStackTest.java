package dsaaj.c3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by yu.tian on 下午6:03.
 * Email mailto:milabobo@126.com.
 */
class MyLinkedListStackTest {
    @Test
    void stack() {
        MyLinkedListStack<String> a = new MyLinkedListStack<String>();
        a.push("g");
        a.push("f");
        a.push("e");
        assertEquals("e", a.pop());
        assertEquals("f", a.peek());
        a.push("m");
        a.push("p");
        assertEquals("p", a.pop());
        assertEquals("m", a.pop());
        assertEquals(false, a.isEmpty());
        System.out.println(a);
        a.clear();
        assertEquals(true, a.isEmpty());
        System.out.println(a);
    }
}