package dsaaj.c3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by yu.tian on 下午5:17.
 * Email mailto:milabobo@126.com.
 */
class MyLinkedListTest {
    @Test
    void list() {
        MyLinkedList<String> a = new MyLinkedList<String>();
        a.add("a");
        a.add("b");
        a.add("c");
        a.add("d");
        a.add("e");
        a.add("f");
        a.add("g");
        print(a);
        a.remove("d");
        print(a);
        a.remove("a");
        print(a);
        a.add(2, "m");
        print(a);
        a.remove(5);
        print(a);
        assertEquals(true, a.contains("m"));
        assertEquals(false, a.contains("n"));
        assertEquals(5, a.size());
        assertEquals(true, !a.isEmpty());
        assertEquals("c", a.get(1));
        assertEquals("e", a.set(3, "t"));
        print(a);
        MyIterator<String> iterator = a.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            if (s != null && s.equals("c")) {
                iterator.remove();
            } else if (s != null && s.equals("t")) {
                iterator.remove();
            } else {
                System.out.print(s);
            }
        }
        print(a);

        a.clear();
        assertEquals(true, a.isEmpty());
        print(a);

        // QUEUE
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

        // STACK
        assertEquals("e", a.pop());
        assertEquals("f", a.peek());
        a.push("m");
        a.push("p");
        assertEquals("p", a.pop());
        assertEquals("m", a.pop());
        assertEquals(false, a.isEmpty());
        a.clear();
        assertEquals(true, a.isEmpty());

        // DEQUE
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
    }

    @Test
    void nullCheck() {
        MyLinkedList<String> a = new MyLinkedList<String>();
        a.add("a");
        a.add("b");
        a.add(null);
        a.add("d");
        a.add(null);
        a.add("f");
        a.add("g");
        print(a);
        a.remove("d");
        print(a);
        a.remove(null);
        print(a);
        a.add(2, "m");
        print(a);
        a.remove(5);
        print(a);
        assertEquals(true, a.contains("m"));
        assertEquals(false, a.contains("n"));
        assertEquals(5, a.size());
        assertEquals(true, !a.isEmpty());
        assertEquals("b", a.get(1));
        assertEquals("f", a.set(4, "t"));
        print(a);
        MyIterator<String> iterator = a.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            if (s == null) {
                iterator.remove();
            } else if (s.equals("t")) {
                iterator.remove();
            } else {
                System.out.print(s);
            }
        }
        print(a);

        a.clear();
        assertEquals(true, a.isEmpty());
        print(a);

        // QUEUE
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

        // STACK
        assertEquals("e", a.pop());
        assertEquals("f", a.peek());
        a.push("m");
        a.push("p");
        assertEquals("p", a.pop());
        assertEquals("m", a.pop());
        assertEquals(false, a.isEmpty());
        a.clear();
        assertEquals(true, a.isEmpty());

        // DEQUE
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
    }

    static void print(MyLinkedList<String> a) {
        System.out.println(a);
    }
}