package patterns;

public class TrianglePatternType2 {
    public static void main(String[] args) {
        int count = 5;
        drawPattern(count);
    }

    public static void drawPattern(int count) {
        //    *
        //   ***
        //  *****
        // *******
        //*********
        for (int i = 1; i <= count; i++) {
            for (int j = 1; j <= (count-i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= ((2*i)-1); k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
