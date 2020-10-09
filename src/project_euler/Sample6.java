package project_euler;

import java.util.Arrays;
import java.util.Scanner;

public class Sample6 {
    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
        //long T = scan.nextLong();
        long T = 1;
        if (T > 0) {
            for (int k = 0; k < T; k++) {
                //long N = scan.nextLong();
                long N = 10;
                long[] unitA = new long[]{3, 6, 7, 5, 3, 5, 6, 2, 9, 1};
                long[] unitB = new long[]{2, 7, 0, 9, 3, 6, 0, 6, 2, 6};
                /*for (int i = 0; i < N; i++) {
                    unitA[i] = scan.nextLong();
                }
                for (int i = 0; i < N; i++) {
                    unitB[i] = scan.nextLong();
                }*/
                int result = 0;
                Arrays.sort(unitA);
                Arrays.sort(unitB);
                for (int i = 0; i < N; i++) {
                    //System.out.print(unitA[i] + " ");
                }
                System.out.println(" ");
                for (int i = 0; i < N; i++) {
                    //System.out.print(unitB[i] + " ");
                }
                for (int i = 0; i < N; i++) {
                    if ((int) unitA[i] > (int) unitB[i]) {
                        result++;
                    } else {
                        break;
                    }
                }
                System.out.println(" ");
                /*boolean flag = true;
                do {
                    int unitA_counter = (int) N-1;
                    int unitB_counter = (result - 1);
                    if ((int) unitA[unitA_counter] > (int) unitB[unitB_counter]) {
                        result++;
                        unitA_counter--;
                        unitB_counter++;
                    } else {
                        flag = false;
                    }
                } while (flag);*/
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
                System.out.println(" ");
                System.out.println(result);
            }
        }
    }
}
