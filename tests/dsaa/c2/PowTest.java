package dsaa.c2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by yu.tian on 下午12:04.
 * Email mailto:tianyu1@le.com.
 */
class PowTest {
    @Test
    void pow() {
        assertEquals(1024, Pow.pow(2, 10));
        assertEquals(2048, Pow.pow(2, 11));
        assertEquals(1, Pow.pow(2, 0));
        assertEquals(2, Pow.pow(2, 1));
    }

}