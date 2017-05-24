package dsaa.c1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by yu.tian on 下午1:53.
 * Email mailto:tianyu1@le.com.
 */
class KMaxTest {
    @Test
    void kMax() {
        int a[] = {1, 2, 3, 4};
        assertEquals(4, KMax.kMax(a, 1));
        assertEquals(3, KMax.kMax(a, 2));
        assertEquals(2, KMax.kMax(a, 3));
        assertEquals(1, KMax.kMax(a, 4));

        a = new int[]{6, 5, 6, 5, 4};
        assertEquals(6, KMax.kMax(a, 1));
        assertEquals(6, KMax.kMax(a, 2));
        assertEquals(5, KMax.kMax(a, 3));
    }

}