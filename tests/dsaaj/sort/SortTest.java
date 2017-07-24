package dsaaj.sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by milabobo on 11:13 AM.
 * Email mailto:milabobo@126.com
 */
public class SortTest {
    static int[] SORTED = { 1, 2, 3, 4, 5, 6, 7, 8, 8, 9, 10};
    static int[] TEST = {7, 4, 6, 9, 1, 8, 8, 2, 3, 5, 10};

    @Test
    void testBubbleSort() {
        int[] array = Arrays.copyOf(TEST, TEST.length);
        SortStrategy sortStrategy = new SortStrategy(array);
        sortStrategy.sort(new BubbleSort());
        assertArrayEquals(array, SORTED);
    }

    @Test
    void testSelectionSort() {
        int[] array = Arrays.copyOf(TEST, TEST.length);
        SortStrategy sortStrategy = new SortStrategy(array);
        sortStrategy.sort(new SelectionSort());
        assertArrayEquals(array, SORTED);
    }

    @Test
    void testInsertionSort() {
        int[] array = Arrays.copyOf(TEST, TEST.length);
        SortStrategy sortStrategy = new SortStrategy(array);
        sortStrategy.sort(new InsertionSort());
        assertArrayEquals(array, SORTED);
    }

    @Test
    void testQuickSort() {
        int[] array = Arrays.copyOf(TEST, TEST.length);
        SortStrategy sortStrategy = new SortStrategy(array);
        sortStrategy.sort(new QuickSort());
        assertArrayEquals(array, SORTED);
    }

    @Test
    void testMergeSort() {
        int[] array = Arrays.copyOf(TEST, TEST.length);
        SortStrategy sortStrategy = new SortStrategy(array);
        sortStrategy.sort(new MergeSort());
        assertArrayEquals(array, SORTED);
    }

    @Test
    void testCountSort() {
        int[] array = Arrays.copyOf(TEST, TEST.length);
        SortStrategy sortStrategy = new SortStrategy(array);
        sortStrategy.sort(new CountSort());
        assertArrayEquals(array, SORTED);
    }

    @Test
    void testHeapSort() {
        int[] array = Arrays.copyOf(TEST, TEST.length);
        SortStrategy sortStrategy = new SortStrategy(array);
        sortStrategy.sort(new HeapSort());
        assertArrayEquals(array, SORTED);
    }
}
