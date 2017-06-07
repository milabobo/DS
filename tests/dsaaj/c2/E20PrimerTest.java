package dsaaj.c2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by yu.tian on 下午1:58.
 * Email mailto:milabobo@126.com.
 */
class E20PrimerTest {
    @Test
    void isPrimer() {
        assertEquals(true, E20Primer.isPrimer(2));
        assertEquals(true, E20Primer.isPrimer(3));
        assertEquals(false, E20Primer.isPrimer(4));
        assertEquals(true, E20Primer.isPrimer(5));
    }

}