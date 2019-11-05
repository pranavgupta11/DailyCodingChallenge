package project_euler;

/***
 * Find Sum Of Multiples Of 3 And 5 upto a given number N 
 * Step 1 Check if the number is greater than 0
 * Step 2 iterate from 0 to N and if number is multiple of 3 or 5 then add it to locally calculated sum
 ***/
public class FindSumOfMultiplesOf3And5 {
    public static void main(String[] args) {
	System.out.println("Sum is " + findSumOfMultiplesOf3And5(1000));
    }

    public static int findSumOfMultiplesOf3And5(int number) {
	int sum = 0;
	if (number > 0)
	    for (int i = 0; i < number; i++) {
		if (i % 3 == 0 || i % 5 == 0) {
		    sum += i;
		}
	    }
	return sum;
    }
}
