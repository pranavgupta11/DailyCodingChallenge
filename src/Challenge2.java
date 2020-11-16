import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.print("Enter no. of elements you want in array:");
	int x = s.nextInt();
	int y = s.nextInt();
	int arr[][] = new int[x][y];
	System.out.println("Enter all the elements:");
	for (int i = 0; i < x; i++) {
	    for (int j = 0; j < y; j++) {
		arr[i][j] = s.nextInt();
	    }
	}
	System.out.println("x "+x+" y "+y+" size "+arr.length);
    }
}
