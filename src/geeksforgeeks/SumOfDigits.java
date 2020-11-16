package geeksforgeeks;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(methodName(12789));
    }

    public static int methodName(int number) {

	int result = 0;
	while(number>0) {
	    number = number/10;
	    result++;
	}
	return result;

    }
}
