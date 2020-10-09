package geeksforgeeks;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int result = sumOfNaturalNumbers(3);
        System.out.print("Reult of Sum Of Natural Numbers is "+result);
    }

    public static int sumOfNaturalNumbers(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
