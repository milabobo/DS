package dsaaj.c2;

/**
 * Created by yu.tian on 下午7:31.
 * Email mailto:tianyu1@le.com.
 */
public class MaxSequence {
    static int sumAl1(int[] a) {
        int maxSum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                int sum = 0;
                for (int k = i; k < j; k++) {
                    sum += a[k];
                }

                if (maxSum < sum) {
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }

    static int sumAl2(int[] a) {
        int maxSum = 0;
        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = i; j < a.length; j++) {
                sum += a[j];

                if (maxSum < sum) {
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }

    static int sumAl4(int[] a) {
        int sum = 0;
        int thisSum = 0;
        for (int i = 0; i < a.length; i++) {
            thisSum += a[i];

            if (thisSum > sum) {
                sum = thisSum;
            } else if (thisSum < 0) {
                thisSum = 0;
            }
        }
        return sum;
    }

    // TODO max multiply seq
    // TODO min sum seq
    // TODO min positive seq
}
