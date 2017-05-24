package dsaa.c1;

/**
 * Created by yu.tian on 下午5:05.
 * Email mailto:tianyu1@le.com.
 */
public class CountN {

    static int countDigit1(int i) {
        if (i <= 1) {
            return 1 & i;
        }

        return (i & 1) + countDigit1(i >> 1);
    }

    public static void main(String[] args) {
        System.out.println(countDigit1(2));
    }
}
