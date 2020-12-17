package practice;

import java.util.HashSet;
import java.util.Scanner;

public class AnagramString {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s = sc.next();
	String s1 = sc.next();

	System.out.println(remAnagrams(s, s1));
    }

    public static int remAnagrams(String s, String s1) {
	HashSet<Character> hs = new HashSet<>();
	for (int i = 0; i < s1.length(); i++) {
	    hs.add(s.charAt(i));
	}
	int count = 0;
	for (int i = 0; i < s.length(); i++) {
	    if (!hs.contains(s.charAt(i))) {
		count++;
	    }
	}
	return count;
    }

}
