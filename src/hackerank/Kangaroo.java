package hackerank;

public class Kangaroo {
    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {
        if (x1 > x2) {
            return "NO";
        }
        if (v2 > v1) {
            return "NO";
        }
        if (v1 == v2 && x1 != x2) {
            return "NO";
        }
        if ((x2 - x1) % (v1 - v2) == 0) {
            return "YES";
        } else {
            return "NO";
        }

    }


    public static void main(String[] args) {
        //0 2 5 3
        String result = kangaroo(0, 2, 5, 3);

        System.out.println(result);

    }
}
