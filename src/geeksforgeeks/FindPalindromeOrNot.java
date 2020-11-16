package geeksforgeeks;

public class FindPalindromeOrNot {
    public static void main(String[] args) {
	System.out.print(methodName(1221));
    }

    public static boolean methodName(int number) {

	int temp = number;
	int rev = 0;
	while (temp != 0) {
	    int id = temp % 10;
	    rev = rev * 10 + id;
	    temp = temp / 10;
	}

	return (rev == number);
    }
}
