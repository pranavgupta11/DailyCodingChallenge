package practice;

import java.util.*;

public class LargestNumber {
    public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] arr = new int[n];
	for (int i = 0; i < n; i++) {
	    arr[i] = sc.nextInt();
	}
	sc.close();
	System.out.println("Number is "+getLargestNumer(arr, n));
    }
    
    public static String getLargestNumer(int[] arr, int n) {
	String str = "";
	if (arr.length == 0) {
	    return str;
	}
	String[] arr_s = new String[n];
	for (int i = 0; i < n; i++) {
	    arr_s[i] = Integer.toString(arr[i]);
	}
	for (int i = 0; i < n; i++) {
	    int j = i + 1;
	    while (j < n) {
		if (Integer.parseInt(arr_s[i] + arr_s[j]) < Integer.parseInt(arr_s[j] + arr_s[i])) {
		    String temp = arr_s[i];
		    arr_s[i] = arr_s[j];
		    arr_s[j] = temp;
		    j++;
		}
	    }
	}
	if (arr_s[0] == "0") {
	    return "0";
	}
	StringBuilder sb = new StringBuilder();
	for (int i = 0; i < n; i++) {
	    sb.append(arr_s[i]);
	}
	str = sb.toString();
	return str;
    }
}


