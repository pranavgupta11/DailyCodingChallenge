package hackerank;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MinMaxSum {

    // Complete the miniMaxSum function below.
    public static void miniMaxSum(int[] arr) {
        long[] Result = new long[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int tempSummin = 0;
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    tempSummin += arr[j];
                }
            }
            Result[i] = tempSummin;
        }
        Arrays.sort(Result);
        System.out.println(Result[0] + " " + Result[(arr.length - 1)]);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        miniMaxSumOtherApproch(arr);
        miniMaxSum(arr);
    }

    public static void miniMaxSumOtherApproch(int[] arr) {
        int minSum = 0;
        int maxSum = 0;
        for (int i = 0; i < arr.length; i++) {
            int tempSummin = 0;
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    tempSummin += arr[j];
                }
            }
            if (minSum == 0 && maxSum == 0) {
                minSum = tempSummin;
                maxSum = tempSummin;
            }
            if (tempSummin < minSum) {
                minSum = tempSummin;
            }
            if (tempSummin > maxSum) {
                maxSum = tempSummin;
            }
        }

        System.out.println(minSum + " " + maxSum);
    }
}
