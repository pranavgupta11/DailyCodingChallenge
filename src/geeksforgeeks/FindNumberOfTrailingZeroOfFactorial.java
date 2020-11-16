package geeksforgeeks;

public class FindNumberOfTrailingZeroOfFactorial {
    public static void main(String[] args) {
	System.out.println(methodName2(100));
    }

    public static int methodName(int n) {
	int result = 0;
	long factorial = findFactorial(n);
	System.out.println("Factorial of " + n + " is " + factorial);
	while (factorial % 10 == 0) {
	    result++;
	    factorial = factorial / 10;
	}

	return result;
    } /*** Time complexity Theta(n) but will not work for bigger numbers, 
    like factorial of 20 may be too long for int to store so other method gives proper solution
    there we find number of factors divisible 5 and count that ***/

    public static long findFactorial(int n) {
	long result = 1;
	for (int i = 2; i <= n; i++) {
	    result = result * i;
	}
	return result;
    }

    public static int methodName2(int n) {
	int result = 0;
	for (int i = 5; i <= n; i = i * 5) {
	    result = result + (n / i);
	}
	return result;
    }// Time complexity Theta(long n)
}
