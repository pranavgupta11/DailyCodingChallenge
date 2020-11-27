package practice;

import java.util.Scanner;

public class NumberIsPrimeOrNot {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();

    }

    //Big O(log n)
    public static boolean isPrime(int n) {
	if (n == 1) {
	    return false;
	}
	if (n == 2) {
	    return true;
	}
	// Check if n is a multiple of 2
	if (n % 2 == 0) {
	    return false;
	}
	for (int i = 3; i < Math.sqrt(n); i++) {
	    if (n % i == 0) {
		return false;
	    }
	}
	return true;
    }
}
