package hackerank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class MinimumSwaps2 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int arr[] = new int[n];
	for (int i = 0; i < n; i++) {
	    arr[i] = sc.nextInt();
	}
	
	System.out.println("Minimum Swaps required are " + minimumSwaps(arr));

    }

    public static int minimumSwaps(int[] arr) {
	int n = arr.length;
	int swapCount = 0;

	HashMap<Integer, Boolean> hm = new HashMap<>();
	for (int i = 0; i < n; i++) {
	    if ((arr[i] - 1) == i) {
		hm.put(i, true);
	    } else {
		hm.put(i, false);
	    }

	}
	for (int i = 0; i < n-1; i++) {
	    if (!hm.get(i)) {
		arr = swap(arr, i, (arr[i] - 1));
		swapCount++;
		hm.put(i, true);
	    }
	    System.out.println(Arrays.toString(arr));
	}
	
	return swapCount;
    }

    public static int[] swap(int[] arr, int i, int j) {
	int temp = arr[i];
	arr[i] = arr[j];
	arr[j] = temp;
	return arr;
    }
}
