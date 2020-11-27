package practice;

import java.util.Arrays;
import java.util.Scanner;

public class SortColors {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int arr[] = new int[n];
	for (int i = 0; i < n; i++) {
	    arr[i] = sc.nextInt();
	}
	sortColors(arr);
    }

    public static void sortColors(int[] arr) {
	int n = arr.length;
	int i = 0;
	int j = n - 1;
	int k = j;
	while(i<=j) {
	    int curr = arr[j];
	    if(curr == 0) {
		swap(arr,i++,j);
	    } else if(curr ==2) {
		swap(arr,j--,k--);
	    }else {
		j--;
	    }
	}
	System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] arr,int i,int j) {
	int temp = arr[i];
	arr[i] = arr[j];
	arr[j] = temp;
    }
}
