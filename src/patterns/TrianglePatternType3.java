package patterns;

public class TrianglePatternType3 {
    public static void main(String[] args) {
        int count = 5;
        drawPattern(count,"*");
    }

    public static void drawPattern(int count, String displayElement) {
        int intermediate = (count+1)/2;
        System.out.println(intermediate);
        //  *
        // ***
        //*****
        // ***
        //  *
        for (int i = 1; i <= intermediate; i++) {
            for (int j = 1; j <= (intermediate-i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= ((2*i)-1); k++) {
                System.out.print(displayElement);
            }
            System.out.print("\n");
        }
        for (int i = intermediate; i >= 1; i--) {
            for (int j = (intermediate-i); j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = ((2*i)-1); k >= 1; k--) {
                System.out.print(displayElement);
            }
            System.out.print("\n");
        }
    }
}
