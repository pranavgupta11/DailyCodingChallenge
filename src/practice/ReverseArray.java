package practice;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] arr = new int[n];
	for (int i = 0; i < n; i++) {
	    arr[i] = sc.nextInt();
	}
	method1(arr);
    }

    public static void method1(int[] arr) {
	int n = arr.length;
	int result[] = new int[n];
	int j = n;
	for (int i = 0; i < n; i++) {
	    result[j - 1] = arr[i];
	    j -= 1;
	}
	//System.out.println(Arrays.toString(result));
    }
}
