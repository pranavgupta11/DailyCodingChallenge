package practice;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeNumberFromRange {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();

	printPrimeSieve(n);

	// Big (O(n) * O(log n))
	/*
	 * for (int i = 2; i < n; i++) { if (isPrime(i)) System.out.print(i + " "); }
	 */
    }

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

    public static void printPrimeSieve(int n) {
	int[] prime = new int[n];
	for (int i = 2; i < n; i++) {
	    if (prime[i] == 0) {
		for (int j = i * i; j < n; j += i) {
		    prime[j] = 1;
		}
	    }
	}
	for (int i = 2; i < n; i++) {
	    if (prime[i] == 0)
		System.out.print(i+" ");
	}
    }
}
