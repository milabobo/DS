package dsaaj.c4;

import java.io.File;

/**
 * Created by yu.tian on 2:37 PM.
 * Email mailto:milabobo@126.com.
 */
public class UnixFiles {

    public static void main(String[] args) {
        //File folder = new File("/Users/leshitianyu/Documents/Adobe");
        File folder = new File("./");
        System.out.println("======\npre print");
        prePrint(folder);
        System.out.println("======\npost print");
        postPrint(folder);
    }

    static void prePrint(File folder) {
        prePrint(0, folder);
    }

    static void prePrint(int depth, File folder) {
        printDepth(depth, folder.getName());
        if (folder.isDirectory()) {
            File[] files = folder.listFiles();
            if (files != null && files.length > 0) {
                for (int i = 0; i < files.length; i++) {
                    prePrint(depth + 1, files[i]);
                }
            }
        }
    }

    static void postPrint(File folder) {
        System.out.println("size is " + postPrint(0, folder, 0) + "B");
    }

    static long postPrint(int depth, File folder, long totalSize) {
        File[] files = folder.listFiles();
        // file
        if (files == null || files.length == 0) {
            printDepth(depth, folder.getName());
            return files == null ? folder.length() : 0;
        } else {
            long length = totalSize;
            for (int i = 0; i < files.length; i++) {
                length += postPrint(depth + 1, files[i], totalSize);
            }
            printDepth(depth, folder.getName());
            return length;
        }
    }

    static void printDepth(int depth, String name) {
        for (int i = 0; i < depth; i++) {
            System.out.print("\t");
        }
        System.out.println(name);
    }
}
