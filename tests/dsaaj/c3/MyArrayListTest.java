package dsaaj.c3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by yu.tian on 下午6:08.
 * Email mailto:tianyu1@le.com.
 */
class MyArrayListTest {
    @Test
    void list() {
        MyArrayList<String> a = new MyArrayList<String>();
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
            if (s.equals("c")) {
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
    }

    static void print(MyArrayList<String> a) {
        System.out.println(a);
    }
}