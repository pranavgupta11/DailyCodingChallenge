package hackerank;

public class ApplesAndOranges {
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int count_apples = 0;
        int count_oranges = 0;
        for (int i = 0; i < apples.length; i++) {
            if ((apples[i] + a) >= s && (apples[i] + a) <= t) {
                count_apples++;
            }
        }
        System.out.println(count_apples);
        for (int i = 0; i < oranges.length; i++) {
            if ((oranges[i] + b) >= s && (oranges[i] + b) <= t) {
                count_oranges++;
            }
        }
        System.out.println(count_oranges);
    }

    public static void main(String[] args) {
        int[] apples = new int[]{-2,2,1};//3,7,6
        int[]oranges = new int[]{5,-6};//20,9
        countApplesAndOranges(7,11,5,15,apples,oranges);
    }
}
