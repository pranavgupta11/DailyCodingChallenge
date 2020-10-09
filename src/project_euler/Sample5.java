package project_euler;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Sample5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long T = scan.nextLong();
        if (T > 0) {
            for (int k = 0; k < T; k++) {
                long N = scan.nextLong();
                long[] unitA = new long[(int) N];
                long[] unitB = new long[(int) N];
                for (int i = 0; i < N; i++) {
                    unitA[i] = scan.nextLong();
                }
                for (int i = 0; i < N; i++) {
                    unitB[i] = scan.nextLong();
                }
                int result = 0;
                Arrays.sort(new long[][]{unitA}, Collections.reverseOrder());
                //Arrays.sort(unitA);
                Arrays.sort(unitB);
                for (int i = 0; i < N; i++) {
                    if ((int) unitA[i] > (int) unitB[i]) {
                        result++;
                    } else {
                        break;
                    }
                }
                if (result > 0) {
                for (int i = ((int) N - 1); i > 0; i--) {
                    for (int j = (result - 1); j < (int) N; j++) {
                        //System.out.println("i is " + i + " j is " + j);
                        if ((int) unitA[i] > (int) unitB[j]) {
                            result++;
                            break;
                        } else {
                            break;
                        }
                    }
                }
                }

                System.out.println(result);
            }
        }
    }
}
