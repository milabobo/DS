package dsaa.c2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by yu.tian on 下午2:31.
 * Email mailto:tianyu1@le.com.
 */
class E23PowTest {
    @Test
    void pow() {
        assertEquals(1024, E23Pow.pow(2, 10));
        assertEquals(2048, E23Pow.pow(2, 11));
        assertEquals(256, E23Pow.pow(2, 8));
    }

}