package amazon;

import java.util.HashSet;

public class StringBinary {
    public static void main(String[] args) {
	System.out.println(binarySubstring(84, "011110011010110000010110001111000111010111101001010100100011101010111010101001010000"));
    }

    public static int binarySubstring(int a, String str) {
	int n = str.length();
	int result = 0;
	for (int i = 0; i < n - 1; i++) {
	    for (int j = i + 1; j < n; j++) {
		String subStr = str.substring(i, j);
		if (subStr.startsWith("1") && subStr.endsWith("1")) {
		    result++;
		}
	    }
	}
	return result;
    }
}
