package algoexpert;

import java.util.Arrays;
import java.util.Collections;

public class TwoNumberSum {

    public static void main(String arg[]) {
	int[] array = new int[3];
	array[0] = 3;
	array[1] = 8;
	array[2] = 4;
	// array[3]=1;
	// array[4]=5;
	int[] result = twoNumberSum(array, 12);
	for (int i = 0; i < result.length; i++) {
	    System.out.print(result[i] + " ");
	}
	System.out.println(" ");
	int[] array1 = new int[5];
	array1[0] = 3;
	array1[1] = 2;
	array1[2] = 4;
	array1[3] = -1;
	array1[4] = 5;
	twoNumberSumOther(array1, 6);
    }

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
	    firstnum =  Math.abs(array[i]);
	    for (int j = i + 1; j < array.length; j++) {
		secondnum =  Math.abs(array[j]);
		if (firstnum + secondnum == targetSum) {
		    System.out.println(i + " " + j);
		}
	    }
	}

    }
}
