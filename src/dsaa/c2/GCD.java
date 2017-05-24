package dsaa.c2;

/**
 * Created by yu.tian on 上午11:51.
 * Email mailto:tianyu1@le.com.
 */
public class GCD {
    static int gcd(int a, int b) {
        if (a < b) {
            int tmp = a;
            a = b;
            b = tmp;
        }

        while (b > 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    static int gcdRe(int a, int b) {
        if (a < b) {
            int tmp = a;
            a = b;
            b = tmp;
        }

        if (a % b == 0) {
            return b;
        }

        return gcdRe(b, a % b);
    }
}
