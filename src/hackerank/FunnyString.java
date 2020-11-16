package hackerank;

import java.util.Arrays;

public class FunnyString {
    public static void main(String[] args) {
String s = "ovyvzvptyvpvpxyztlrztsrztztqvrxtxuxq";

System.out.println(funnyString(s));
    }

    static String funnyString(String s) {
	String result = "";
	char[] chr_array = s.toCharArray();
	int[] int_chr_array = new int[chr_array.length];
	for(int i=0;i<chr_array.length;i++) {
	    int_chr_array[i] = (int) chr_array[i];
	}
	System.out.println(Arrays.toString(int_chr_array));
	int[] temp = new int[(chr_array.length-1)];
	for(int j=1;j<chr_array.length;j++) {
	    temp[j-1]=Math.abs(int_chr_array[j-1]-int_chr_array[j]);
	}
	System.out.println(Arrays.toString(temp));
	return palindrome(temp, temp.length);

    }
    static String palindrome(int arr[], int n) 
    { 
        // Initialise flag to zero. 
        int flag = 0; 
  
        // Loop till array size n/2. 
        for (int i = 0; i <= n / 2 && n != 0; i++) { 
  
            // Check if first and last element are different 
            // Then set flag to 1. 
            if (arr[i] != arr[n - i - 1]) { 
                flag = 1; 
                break; 
            } 
        } 
  
        // If flag is set then print Not Palindrome 
        // else print Palindrome. 
        if (flag == 1) 
            return("Not Funny"); 
        else
            return("Funny"); 
    } 
}
