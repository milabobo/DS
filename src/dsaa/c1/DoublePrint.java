package dsaa.c1;

/**
 * Created by yu.tian on 下午4:25.
 * Email mailto:tianyu1@le.com.
 */
public class DoublePrint {

    public static void printDouble(double v, int nFraction) {
        // int part, fraction part
        if (v < 0) {
            printMinues();
            v = -v;
        }
        int i = (int) v;
        int f = (int)((v - i) * pow(10, nFraction));

        printInt(i);
        if (nFraction > 0) {
            printPoint();
            printInt(f);
            int count = 1;
            int k = f;
            while (k > 10) {
                k = k / 10;
                count++;
            }

            k = count;
            while (nFraction - k > 0) {
                printDigit(0);
                k++;
            }
        }
    }

    private static void printIntRecurse(int i) {
        if (i >= 10) {
            printIntRecurse(i / 10);
        }
        printDigit(i % 10);
    }

    private static void printInt(int i) {
        int k = i;
        int loop = 0;
        while (k >= 10) {
            k = k / 10;
            loop++;
            if (k < 10) {
                printDigit(k);
                k = i - k * pow(10, loop);
                loop = 0;
                i = k;
            }
        }
        printDigit(k);
    }

    private static int pow(int i, int k) {
        int value = 1;
        for (int j = 0; j < k; j++) {
            value = value * i;
        }
        return value;
    }

    private static void printDigit(int value) {
        System.out.print(value);
    }

    private static void printPoint() {
        System.out.print(".");
    }

    private static void printMinues() {
        System.out.print("-");
    }

    public static void line() {
        System.out.println();
    }

    public static void main(String[] args) {
        printInt(8);
        line();
        printInt(129998);
        line();
        printIntRecurse(129998);
        line();
        printDouble(1283128.112318797, 5);
        line();
        printDouble(-1283128.112318797, 6);
        line();
        printDouble(-1283128.112318797, 0);
        line();
        printDouble(0, 5);
    }

}
