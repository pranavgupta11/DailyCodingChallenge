package algoexpert;

public class KadanesAlgorithm {

    public static void main(String args[]) {
	int[] array = { 1, -3, 2, 1, -1 };
	System.out.println(kadanesAlgorithm(array));
    }

    public static int kadanesAlgorithm(int[] array) {
	int sum;
	int resultSum;
	sum = array[0];
	resultSum = array[0];
	for (int i = 0; i < array.length; i++) {
	    if (sum + (array[i]) > sum) {
		sum = sum + (array[i]);
		resultSum = Math.max(resultSum, sum + (array[i]));
	    } else {
		sum = 0;
	    }

	}
	return resultSum;
    }
}
