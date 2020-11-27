package practice;

import java.util.HashSet;

public class LargestSubArrayNonRepeating {
    public static void main(String[] args) {
	String s = "abcdabcbb";
	System.out.println("Length of Largest SubArray NonRepeating is " + largestSubArrayNonRepeating(s));
    }

    public static int largestSubArrayNonRepeating(String s) {
	int i = 0;
	int j = 0;
	int max = 0;
	HashSet<Character> hs = new HashSet<>();
	while (j < s.length()) {
	    if (hs.contains(s.charAt(j))) {
		i++;
		j++;
		max = Math.max(max, s.subSequence(i, j).length());
		//str = ""+(s.subSequence(i, j));
	    } else {
		hs.add(s.charAt(j));
		j++;
	    }
	}
	return max;
    }
}
