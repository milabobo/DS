package dsaaj.c2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by yu.tian on 下午8:37.
 * Email mailto:milabobo@126.com.
 */
class SearchTest {
    @Test
    void binarySearch() {
        int[] a = {1, 3, 5, 7, 9};
        assertEquals(-2, Search.binarySearch0(a, 2));
        assertEquals(1, Search.binarySearch(a, 3));
        assertEquals(2, Search.binarySearch(a, 5));
        assertEquals(3, Search.binarySearch0(a, 7));
        assertEquals(4, Search.binarySearch(a, 9));
        assertEquals(-5, Search.binarySearch(a, 8));

        int[] b = {1, 3, 5, 7};
        assertEquals(-2, Search.binarySearch(b, 2));
        assertEquals(1, Search.binarySearch(b, 3));
        assertEquals(2, Search.binarySearch0(b, 5));
        assertEquals(3, Search.binarySearch(b, 7));
        assertEquals(-5, Search.binarySearch0(b, 9));
        assertEquals(-5, Search.binarySearch(b, 8));
    }

}