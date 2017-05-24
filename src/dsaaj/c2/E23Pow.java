package dsaaj.c2;

/**
 * Created by yu.tian on 下午2:02.
 * Email mailto:tianyu1@le.com.
 */
public class E23Pow {
    static int pow(int a, int k) {
        int pow = 1;
        int ret = a;
        while (k > 0) {
            if ((k & 1) == 1) {
                pow = pow * ret;
            }
            ret = ret * ret;
            k = k >> 1;
        }
        return pow;
    }
}
