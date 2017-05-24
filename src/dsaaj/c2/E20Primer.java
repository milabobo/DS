package dsaaj.c2;

/**
 * Created by yu.tian on 下午1:56.
 * Email mailto:tianyu1@le.com.
 */
public class E20Primer {
    static boolean isPrimer(int n) {
        int k = (int) Math.sqrt(n);
        for (int i = 2; i <= k; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
