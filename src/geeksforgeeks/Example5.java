package geeksforgeeks;

import java.util.Scanner;

public class Example5 {

    public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
	//System.out.print("Enter no. of elements you want in array:");
	int size = s.nextInt();
	int arr[] = new int[size];
	//System.out.println("Enter all the elements:");
	for (int i = 0; i < size; i++) {
	    int P = s.nextInt();
	    int N = s.nextInt();
	    int D = s.nextInt();
	    System.out.println(((D-1)*N)+P);
	}

    }

}
