package leetcode.easy;

import java.util.HashMap;

public class LeetCode_E_387_firstUniqChar {
    public static void main(String[] args) {
        String sampleInput = "aaabccdaac";
        System.out.println("LeetCode_E_387_firstUniqChar is " + findFirstNonRepeatingCharacter(sampleInput));
    }

    public static char findFirstNonRepeatingCharacter(String sampleInput) {
        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
        for (int i = 1; i < sampleInput.length(); i++) {
            char c = sampleInput.charAt(i);
            if (hashMap.containsKey(c)) {
                hashMap.put(c, hashMap.get(c) + 1);
            } else {
                hashMap.put(c, 1);
            }
        }
        for (int i = 1; i < sampleInput.length(); i++) {
            char c = sampleInput.charAt(i);
            if (hashMap.get(c) == 1) {
                return c;
            }
        }
        return '_';
    }
}
