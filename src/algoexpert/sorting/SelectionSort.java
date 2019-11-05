package algoexpert.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {8, 5, 2, 9, 5, 6, 3};
        int[] result = selectionSort(array);
        System.out.println(Arrays.toString(result));
    }

    public static int[] selectionSort(int[] array) {
        int currentIndex = 0;
        while (currentIndex < (array.length - 1)) {
            int smallestIndex = currentIndex;
            for (int i = (currentIndex + 1); i < array.length; i++) {
                if (array[smallestIndex] > array[i]) {
                    smallestIndex = i;
                }
            }
            array = swap(currentIndex, smallestIndex, array);
            currentIndex += 1;
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
