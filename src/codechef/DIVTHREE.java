package codechef;
/* remove package line while sunning on codechef*/

import java.util.Scanner;

public class DIVTHREE {
    public static void main(String[] args) throws java.lang.Exception {
	
	try{
	    Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int k = 0; k < T; k++) {
		    int A = sc.nextInt();
		    int K = sc.nextInt();
		    int D = sc.nextInt();
		    int totalSum = 0;
		    for (int i = 0; i < A; i++) {
			totalSum += sc.nextInt();
		    }
		    if (totalSum > 0 && K > 0) {

			int result = (int) totalSum / K;
			if (result > D) {
			    System.out.println(D);
			} else {
			    System.out.println(result);
			}
		    } else {
			System.out.println(0);
		    }

		}
	}catch(Exception e){
		return;
	}
	
	
    }
}
