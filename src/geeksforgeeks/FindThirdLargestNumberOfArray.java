package geeksforgeeks;

import java.util.Scanner;

public class FindThirdLargestNumberOfArray {
    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.print("Enter no. of elements you want in array:");
	int size = s.nextInt();
	int a[] = new int[size];
	System.out.println("Enter all the elements:");
	for (int i = 0; i < size; i++) {
	    a[i] = s.nextInt();
	}
	//System.out.println("size:" + size);
	thirdLargest(a,size);
	
    }

   
    static void thirdLargest(int arr[], int arr_size) {
	/*
	 * There should be atleast three elements
	 */
	if (arr_size < 3) {
	    System.out.printf(" Invalid Input ");
	    return;
	}

	// Find first  
	// largest element 
	int first = arr[0];
	for (int i = 1; i < arr_size; i++)
	    if (arr[i] > first)
		first = arr[i];

	// Find second  
	// largest element 
	int second = Integer.MIN_VALUE;
	for (int i = 0; i < arr_size; i++)
	    if (arr[i] > second && arr[i] < first)
		second = arr[i];

	// Find third 
	// largest element 
	int third = Integer.MIN_VALUE;
	for (int i = 0; i < arr_size; i++)
	    if (arr[i] > third && arr[i] < second)
		third = arr[i];

	System.out.printf("The third Largest " + "element is %d\n", third);
    }
}
