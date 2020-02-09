package hackerank;

import java.util.Arrays;

public class BreakingTheRecords {

    public static void main(String[] args) {
        int[] scores = new int[]{3, 4, 21, 36, 10, 28, 35, 5, 24, 42};
        System.out.println(Arrays.toString(breakingRecords(scores)));
    }

    // Complete the breakingRecords function below.
    static int[] breakingRecords(int[] scores) {
        int[] min = new int[scores.length];
        int[] max = new int[scores.length];
        min[0] = scores[0];
        max[0] = scores[0];
        int result[] = new int[2];
        int minCount = 0;
        int maxCount = 0;
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > max[i - 1]) {
                max[i] = scores[i];
                min[i] = min[i - 1];
            } else {
                if (scores[i] < min[i - 1]) {
                    min[i] = scores[i];
                    max[i] = max[i - 1];
                } else {
                    min[i] = min[i - 1];
                    max[i] = max[i - 1];
                }
            }
        }
        for (int i = 1; i < min.length; i++) {
            if (min[i] < min[i - 1]) {
                minCount++;
            }
        }
        for (int i = 1; i < max.length; i++) {
            if (max[i] > max[i - 1]) {
                maxCount++;
            }
        }
        result[0] = maxCount;
        result[1] = minCount;
        return result;
    }
    static int[] getRecord(int[] s)
    {
        int highest, lowest;
        highest = lowest = s[0];

        int[] result = new int[2];

        for (int s_i = 1; s_i < s.length; s_i++)
        {
            if (s[s_i] > highest)
            {
                highest = s[s_i];
                ++result[0];
            }
            else if (s[s_i] < lowest)
            {
                lowest = s[s_i];
                ++result[1];
            }
        }

        return result;
    }
}
