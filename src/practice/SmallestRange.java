package practice;

import java.util.Scanner;

public class SmallestRange {
    public static void main(String[] args) {
	int[] arr = new int[] { 1, 3, 6 };
	int k = 3;
	System.out.println("Smallest Range is " + smallestRange(arr, k));
    }

    public static int smallestRange(int[] arr, int k) {

	int min_val = arr[0];
	int max_val = arr[0];
	for (int i = 0; i < arr.length; i++) {
	    min_val = Math.min(min_val, arr[i]);
	    max_val = Math.max(max_val, arr[i]);
	}
	return Math.max(0,max_val-min_val-2*k);
    }
}
