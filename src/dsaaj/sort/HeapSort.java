package dsaaj.sort;

/**
 * Created by milabobo on 2:19 PM.
 * Email mailto:milabobo@126.com
 */
public class HeapSort implements ISortMethod {
    @Override
    public void sort(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }

        buildHeap(array);
        for (int i = array.length - 1; i >= 0; i--) {
            Utils.swap(array, i, 0);
            // prec down heap from 0 to i, 0 to i is a max heap
            precDown(array, 0, i);
        }
    }

    private void buildHeap(int[] array) {
        // build a max heap from 0 to length
        for (int i = array.length / 2; i >= 0; i--) {
            precDown(array, i, array.length);
        }
    }

    private void precDown(int[] array, int hole, int n) {
        while (hole < n && leftChild(hole) < n) {
            int child = leftChild(hole);
            if (child != n - 1 && array[child] < array[child + 1]) {
                child++;
            }
            if (array[child] > array[hole]) {
                Utils.swap(array, child, hole);
            } else {
                break;
            }

            hole = child;
        }
    }

    private void precDown1(int[] array, int hole, int n) {
        int child;
        int temp;
        for(temp = array[hole]; leftChild(hole) < n; hole = child) {
            child = leftChild(hole);
            if (child != n - 1 && array[child] < array[child + 1]) {
                child++;
            }
            if (array[child] > temp) {
                array[hole] = array[child];
            } else {
                break;
            }
        }
        array[hole] = temp;
    }

    private int leftChild(int hole) {
        return 2 * hole + 1;
    }

}
