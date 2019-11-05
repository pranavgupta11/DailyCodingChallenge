package algoexpert;
import java.util.Arrays;
import java.util.Collections;

public class TwoNumberSum {
	
	public static void main(String arg[]) {
		int[] array = new int[3];
		array[0]=3;
		array[1]=2;
		array[2]=4;
		int [] result = twoNumberSum(array,6);
		for(int i =0;i<result.length;i++) {
			System.out.println(i+" "+result[i]);
		}
	}
	
	public static int[] twoNumberSum(int[] array, int targetSum) {
		int firstnum,secondnum;
		int result[]=new int[2];
		int result_null[] = new int[0];
		Arrays.sort(array);
			for(int i=0;i<(array.length-1);i++){
				firstnum = array[i];
				for(int j=i+1;j<array.length;j++) {
					secondnum = array[j];
					if(firstnum+secondnum==targetSum) {
						result[0] = i+1;
						result[1]= j;
						return result;
				}
			}
	  }
			return result_null;
	}
}
