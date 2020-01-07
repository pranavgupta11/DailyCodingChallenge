package algoexpert;

public class KadanesAlgorithm {

    public static void main(String args[]) {
        int[] array = {1, -3, 2, 1, -1};
        kadanesAlgorithm(array);
    }

    public static int kadanesAlgorithm(int[] array) {
        int sum;
        int resultSum;
        sum = array[0];
        resultSum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (sum + (array[i]) > sum) {
                sum = sum + (array[i]);
                resultSum = sum + (array[i]);
            } else {

            }

        }
        return resultSum;
    }
}
