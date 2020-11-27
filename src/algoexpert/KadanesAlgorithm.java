package algoexpert;

public class KadanesAlgorithm {

    public static void main(String args[]) {
	int[] array = { 1, -3, 2, 1, -1 };
	int[] array1 = { -2, 2, 5, -11, 6 };
	System.out.println(kadanesAlgorithm(array1));
    }

    public static int kadanesAlgorithm(int[] array) {
	int sum;
	int resultSum;
	sum = array[0];
	resultSum = array[0];
	for (int i = 0; i < array.length; i++) {
	    if (sum + (array[i]) > 0) {
		sum = sum + (array[i]);
		resultSum = Math.max(resultSum, sum);
	    } else {
		sum = 0;
	    }

	}
	return resultSum;
    }
}
