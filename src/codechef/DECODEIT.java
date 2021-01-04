package codechef;

import java.util.Scanner;

public class DECODEIT {
    public static void main(String[] args) throws java.lang.Exception {

	try {
	    Scanner sc = new Scanner(System.in);
	    int T = sc.nextInt();
	    if (T >= 1 && T <= 10) {
		for (int k = 0; k < T; k++) {
		    int N = sc.nextInt();
		    if (N >= 4) {
			String input = sc.next();
			String temp = "";
			for (int j = 1; j <= N; j++) {
			    System.out.println("before temp ="+temp+" j "+j);
			    temp += input.charAt(j - 1);
			    System.out.println("after temp ="+temp+" j "+j);
			    if (j % 4 == 0) {
				if (temp.equals("0000")) {
				    System.out.print("a");
				} else if (temp.equals("1111")) {
				    System.out.print("p");
				} else {
				    System.out.print(binaryToString(temp));
				}
				temp = "";
			    }
			}
			System.out.println("");
		    }
		}
		
	    }
	    sc.close();
	} catch (Exception e) {
	    return;
	}

    }

    public static String binaryToString(String temp) {
	String result = "";
	if (temp.charAt(0) == '0') {
	    // first 8 letters a b c d e f g h
	    if (temp.charAt(1) == '0') {
		// a b c d
		if (temp.charAt(2) == '0') {
		    // a b
		    if (temp.charAt(3) == '0') {
			result = "a";
		    } else {
			result = "b";
		    }
		} else {
		    // c d
		    if (temp.charAt(3) == '0') {
			result = "c";
		    } else {
			result = "d";
		    }
		}
	    } else {
		// e f g h
		if (temp.charAt(2) == '0') {
		    // e f
		    if (temp.charAt(3) == '0') {
			result = "e";
		    } else {
			result = "f";
		    }
		} else {
		    // g h
		    if (temp.charAt(3) == '0') {
			result = "g";
		    } else {
			result = "h";
		    }
		}
	    }
	} else {
	    // last 8 letters i j k l m n o p
	    if (temp.charAt(1) == '0') {
		// i j k l
		if (temp.charAt(2) == '0') {
		    // i j
		    if (temp.charAt(3) == '0') {
			result = "i";
		    } else {
			result = "j";
		    }
		} else {
		    // k l
		    if (temp.charAt(3) == '0') {
			result = "k";
		    } else {
			result = "l";
		    }
		}
	    } else {
		// m n o p
		if (temp.charAt(2) == '0') {
		    // m n
		    if (temp.charAt(3) == '0') {
			result = "m";
		    } else {
			result = "n";
		    }
		} else {
		    // o p
		    if (temp.charAt(3) == '0') {
			result = "o";
		    } else {
			result = "p";
		    }
		}
	    }
	}
	return result;
    }
}
