package kickstart;

import java.util.Arrays;
import java.util.Scanner;

public class Round_A_2020 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int testCaseNo = sc.nextInt();
	for (int i = 0; i < testCaseNo; i++) {
	    int n = sc.nextInt();
		int amount = sc.nextInt();
		int arr[] = new int[n];
		for (int j = 0; j < n; j++) {
		    arr[j] = sc.nextInt();
		}
		int[] result = bubbleSort(arr);
		int count = 0;
		int sum = 0;
		for (int k = 0; k < result.length; k++) {
		    sum += result[k];
		    if (sum <= amount) {
			count++;
		    } else {
			break;
		    }

		}
		System.out.println("Case #"+(i+1)+": " + count);
	}
	
    }

    public static int[] bubbleSort(int[] array) {
	boolean isSorted = false;
	int counter = 0;
	while (!isSorted) {
	    isSorted = true;
	    for (int i = 0; i < (array.length - 1 - counter); i++) {
		if (array[i] > array[i + 1]) {
		    array = swap(i, i + 1, array);
		    isSorted = false;
		}
	    }
	    counter += 1;
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
