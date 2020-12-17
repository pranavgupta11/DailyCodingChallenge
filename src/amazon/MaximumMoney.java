package amazon;

public class MaximumMoney {
    public static void main(String[] args) {
	System.out.println(maximizeMoney(5, 10));
    }

    static int maximizeMoney(int N, int K) {
	int result = 0;
	if (N % 2 == 0) {
	    result = (N / 2) * K;
	} else {
	    result = ((int)(Math.ceil(N / 2))+1) * K;
	}
	return result;
    }
}
