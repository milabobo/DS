package dsaaj.c2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by yu.tian on 下午7:38.
 * Email mailto:tianyu1@le.com.
 */
class MaxSequenceTest {
    @Test
    void al1() {
        int[] a = {-2, 11, -4, 13, -5, -2};
        assertEquals(20, MaxSequence.sumAl1(a));
    }

    @Test
    void al2() {
        int[] a = {-2, 11, -4, 13, -5, -2};
        assertEquals(20, MaxSequence.sumAl2(a));
    }

    @Test
    void al4() {
        int[] a = {-2, 11, -4, 13, -5, -2};
        assertEquals(20, MaxSequence.sumAl4(a));
    }
}