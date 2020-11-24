package algoexpert;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class TwoNumberSum {

    public static void main(String arg[]) {
	int[] array = new int[5];
	array[0] = 3;
	array[1] = 8;
	array[2] = 4;
	array[3]=1;
	array[4]=5;
	int[] result = twoNumberSum(array, 12);
	System.out.print("Result is "+Arrays.toString(result));
	
    }

    // O(N) approach
    public static int[] twoNumberSum2(int[] arr, int targetSum) {
	HashMap<Integer, Integer> hm = new HashMap<>();
	int result[] = new int[2];
	int result_null[] = new int[0];
	for (int i = 0; i < (arr.length - 1); i++) {
	    int compliment = targetSum - arr[i];
	    if (hm.containsKey(compliment)) {
		result[0] = hm.get(compliment);
		result[1] = i;
		return result;
	    } else {
		hm.put(arr[i], i);
	    }
	}
	return result_null;
    }

    // Brut force - O(n^2) linear search with diff return type
    public static int[] twoNumberSum(int[] array, int targetSum) {
	int firstnum, secondnum;
	int result[] = new int[2];
	int result_null[] = new int[0];

	for (int i = 0; i < (array.length - 1); i++) {
	    firstnum = Math.abs(array[i]);
	    for (int j = i + 1; j < array.length; j++) {
		secondnum = Math.abs(array[j]);
		if (firstnum + secondnum == targetSum) {
		    result[0] = i;
		    result[1] = j;
		    return result;
		}
	    }
	}
	return result_null;
    }

    // Brut force - O(n^2) linear search
    public static void twoNumberSumOther(int[] array, int targetSum) {
	int firstnum, secondnum;
	for (int i = 0; i < (array.length - 1); i++) {
	    firstnum = Math.abs(array[i]);
	    for (int j = i + 1; j < array.length; j++) {
		secondnum = Math.abs(array[j]);
		if (firstnum + secondnum == targetSum) {
		    System.out.println(i + " " + j);
		}
	    }
	}

    }
}
