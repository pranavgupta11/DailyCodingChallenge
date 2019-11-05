package algoexpert;
import java.util.ArrayList;
import java.util.Arrays;

public class ThreeNumberSum {
	
	public static void main(String arg[]) {
		int[] array = new int[] {};
		array[0]=1;
		array[1]=2;
		array[2]=3;
		ArrayList<Integer[]> result = threeNumberSum(array,6);
		for(int i =0;i<result.size();i++) {
			System.out.println(i+" "+result.get(i));
		}
	}
	public static ArrayList<Integer[]> threeNumberSum(int[] array, int targetSum) {
		ArrayList<Integer[]> result_list = new ArrayList<>();
		Integer[] result = new Integer[] {};
		int left, right, currentSum;
		Arrays.sort(array);int[] triplets = new int[3];
		for (int i = 0; i < (array.length - 2); i++) {
			left = i + 1;
			right = array.length - 1;
			while (left < right) {
				currentSum = array[i] + array[left] + array[right];
				if (currentSum == targetSum) {
					result[0] = array[i];
					result[1] = array[left];
					result[2] = array[right];
					result_list.add(result);
					left += 1;
					right -= 1;
				} else if (currentSum < targetSum) {
					left += 1;
					
				} else if (currentSum > targetSum) {
					right -= 1;
				}

			}
		}
		return result_list;
	}
}
