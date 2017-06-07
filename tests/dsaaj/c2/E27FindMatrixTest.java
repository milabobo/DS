package dsaaj.c2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by yu.tian on 下午3:15.
 * Email mailto:milabobo@126.com.
 */
class E27FindMatrixTest {
    @Test
    void find() {
        int[][] a = {
                {1, 5, 6, 9},
                {6, 8, 9, 17},
                {10, 11, 18, 20},
                {17, 25, 32, 77}
        };
        assertEquals(true, E27FindMatrix.find(a, 10));
        assertEquals(true, E27FindMatrix.find(a, 18));
        assertEquals(false, E27FindMatrix.find(a, 100));
        assertEquals(false, E27FindMatrix.find(a, 0));
        assertEquals(false, E27FindMatrix.find(a, 12));
    }

}