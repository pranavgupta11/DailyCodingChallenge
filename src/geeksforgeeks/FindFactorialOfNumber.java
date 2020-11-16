package geeksforgeeks;

public class FindFactorialOfNumber {
    public static void main(String[] args) {
	System.out.print(method2(4));
    }

    public static int methodName(int n) {
	int result = 1;
	for (int i = 2; i <= n; i++) {
	    result = result * i;
	}
	return result;
    }

    public static int method2(int n) {
	if (n == 0) {
	    return 1;
	}
	return n * method2(n - 1);
    }
} // O(n)
