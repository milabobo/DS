package dsaaj.c2;

/**
 * Created by yu.tian on 下午3:14.
 * Email mailto:tianyu1@le.com.
 */
public class E27FindMatrix {
    static boolean find(int[][] a, int v) {
        int i = 0;
        int j = a.length - 1;
        int value = a[i][j];

        while (true) {
            if (value == v) {
                return true;
            } else if (value < v && i < a.length - 1) {
                value = a[++i][j];
            } else if (value > v && j > 0) {
                value = a[i][--j];
            } else {
                return false;
            }
        }

    }

}
