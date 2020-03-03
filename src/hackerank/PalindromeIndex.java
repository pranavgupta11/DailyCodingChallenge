package hackerank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PalindromeIndex {

    // Complete the palindromeIndex function below.
    static int palindromeIndex(String s) {
        int palindromIndex = -1;
        int len = s.length();
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - i - 1)) {
                if (i + 1 < len) {
                    boolean isRIghtStringValidPalindrome = isPalindrome(s.substring(i + 1, len - i));
                    if (isRIghtStringValidPalindrome)
                        return i;
                    else return len - i - 1;
                }
            }
        }
        return palindromIndex;
    }

    public static boolean isPalindrome(String str) {

        // Pointers pointing to the beginning
        // and the end of the string
        int i = 0, j = str.length() - 1;

        // While there are characters toc compare
        while (i < j) {

            // If there is a mismatch
            if (str.charAt(i) != str.charAt(j))
                return false;

            // Increment first pointer and
            // decrement the other
            i++;
            j--;
        }

        // Given string is a palindrome
        return true;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = palindromeIndex(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
