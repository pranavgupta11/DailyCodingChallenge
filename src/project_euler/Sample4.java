package project_euler;

import java.util.*;

public class Sample4 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        long result = 0;
        long N = scan.nextLong();
        if(N>0) {
            long[] item = new long[(int)N];
            long[] unit = new long[(int)N];
            for (int i = 0; i < N; i++) {
                item[i] = scan.nextLong();
            }
            for (int i = 0; i < N; i++) {
                unit[i] = scan.nextLong();
            }
            result = (long) (unit[0] / item[0]);
            for (int i = 0; i < N; i++) {
                long tempresult = (long) (unit[i] / item[i]);
                if (tempresult >= 1) {
                    if (tempresult < result) {
                        result = tempresult;
                    }
                }
            }
            System.out.println(result);
        }

    }
}
