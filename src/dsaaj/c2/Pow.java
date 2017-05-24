package dsaaj.c2;

/**
 * Created by yu.tian on 下午12:03.
 * Email mailto:tianyu1@le.com.
 */
public class Pow {
    static int pow(int a, int k) {
        if (k == 0) {
            return 1;
        } else if (k == 1) {
            return a;
        }

        if (k % 2 == 0) {
            return pow(a * a, k / 2);
        } else {
            return a * pow(a * a, (k - 1) / 2);
        }
    }
}
