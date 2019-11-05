package algoexpert.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {8, 5, 2, 9, 5, 6, 3};
        int[] result = insertionSort(array);
        System.out.println(Arrays.toString(result));
    }

    public static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int j = i;
            while (j > 0 && array[j] < array[j - 1]) {
                array = swap(j, j - 1, array);
                j -= 1;
            }
        }
        return array;
    }

    public static int[] swap(int i, int j, int[] array) {
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
        return array;
    }
}
