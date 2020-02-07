package hackerank;

public class CountingValleys {
    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int valley = 0;
        int level = 0;
        for (char c : s.toCharArray()) {
            if (c == 'U') ++level;
            if (c == 'D') --level;
            if (level == 0 && c == 'U') {
                ++valley;
            }
        }
        return valley;
    }


    public static void main(String[] args) {
        int n = 8;
        String s = "UDDDUDUU";
        int result = countingValleys(n, s);
        System.out.println(result);
    }
}


