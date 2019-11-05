package project_euler;
/***
 * Classic problem of printing Fizz Buzz for the multiple of 3 and 5 
 * ***/

public class FizzBuzzProblem {
    public static void main(String[] args) {
	printFizzBuzz(100);
    }

    public static void printFizzBuzz(int number) {
	for (int i = 1; i <= number; i++) {
	    if (i % 5 == 0 && i % 3 == 0) {
		System.out.println("FizzBuzz");
	    } else if (i % 5 == 0) {
		System.out.println("Fizz");
	    } else if (i % 3 == 0) {
		System.out.println("Buzz");
	    } else {
		System.out.println(Integer.toString(i));
	    }
	}
    }
}
