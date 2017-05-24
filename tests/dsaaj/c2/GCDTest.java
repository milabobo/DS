package dsaaj.c2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by yu.tian on 上午11:56.
 * Email mailto:tianyu1@le.com.
 */
class GCDTest {
    @Test
    void gcd() {
        assertEquals(3, GCD.gcd(12, 9));
        assertEquals(8, GCD.gcd(24, 8));
        assertEquals(3, GCD.gcdRe(12, 9));
        assertEquals(8, GCD.gcdRe(24, 8));
    }

}