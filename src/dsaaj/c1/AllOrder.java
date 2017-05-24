package dsaaj.c1;

/**
 * Created by yu.tian on 下午5:17.
 * Email mailto:tianyu1@le.com.
 */
public class AllOrder {

    static class Count {
        int count;
    }
    static void permute(String str) {
        char[] a = str.toCharArray();

        Count c = new Count();
        permute(c, a, 0, a.length);
        DoublePrint.line();
        System.out.println("Count for " + str + " is " + c.count);
    }

    static void swap(char[]a, int i, int j) {
        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static boolean shouldSwap(char[]a, int i, int j) {
        for (int k = i; k < j; k++) {
            if (a[k] == a[j]) {
                return false;
            }
        }
        return true;
    }

    static void permute(Count c, char[] str, int low, int high) {
        if (low == high) {
            printS(str);
            c.count++;
        }
        for (int i = low; i < high; i++) {
            if (shouldSwap(str, low, i)) {
                swap(str, low, i);
                permute(c, str, low + 1, high);
                swap(str, i, low);
            }
        }
    }

    static void printS(char[] a) {
        System.out.print(a);
        System.out.print(", ");
    }

    public static void main(String[] args) {
        permute("abcpo");
        DoublePrint.line();
        permute("aac");
    }
}
