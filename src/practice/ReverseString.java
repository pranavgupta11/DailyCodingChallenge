package practice;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String str = sc.next();

	reverse(str);
    }

    //Recursive way
    public static void reverse(String str) {
	if (str.length() == 0)
	    return;
	String ros = str.substring(1);
	reverse(ros);
	System.out.print(str.charAt(0));
    }

}
