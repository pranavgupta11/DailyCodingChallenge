package hackerank;

public class JumpingontheClouds {
    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c, int n) {
        int count = -1;
        for (int i = 0; i < n; i++, count++) {
            if (i < n - 2 && c[i + 2] == 0) i++;
        }
        return count;
    }


    public static void main(String[] args) {
        int n = 7;
        int[] c = new int[]{0, 0, 1, 0, 01, 0};
        int result = jumpingOnClouds(c, n);
        System.out.println(result);
    }
}


