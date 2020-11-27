package practice;

public class LargetRectangleInHistogram {
    public static void main(String args[]) {
	int[] array = { 1, -3, 2, 1, -1 };
	int[] array1 = { -2, 2, 5, -11, 6 };
	System.out.println(largetRectangleInHistogram(array1));
    }

    public static int largetRectangleInHistogram(int[] array) {
	int area = 0;
	int currentArea = 0;
	int count = 0;

	for (int i = 1; i < array.length; i++) {
	    if (array[i] > array[i - 1]) {
		count++;
	    } else {
		count = 0;
	    }
	}
	//soultion pending

	int min = array[0];
	for (int i = 1; i < array.length; i++) {
	    min = Math.min(min, array[i]);
	}
	area = min * array.length;

	return area;
    }
}
