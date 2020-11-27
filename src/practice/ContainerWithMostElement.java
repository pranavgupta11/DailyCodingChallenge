package practice;

import java.util.Scanner;

public class ContainerWithMostElement {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int arr[] = new int[n];
	for (int i = 0; i < n; i++) {
	    arr[i] = sc.nextInt();
	}
	System.out.println("Container With Most Element is "+method1(arr));

    }

    public static int method1(int[] arr) {
	int max = 0;
	int i = 0;
	int j = arr.length - 1;
	while (i < j) {
	    int area = (j - i) * Math.min(arr[i], arr[j]);
	    if (max < area)
		max = area;
	    if (arr[i] < arr[j]) {
		i++;
	    } else {
		j--;
	    }

	}
	return max;
    }
}
