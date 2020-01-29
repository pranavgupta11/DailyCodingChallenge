package patterns;

public class SimpleTrianglePattern {
    public static void main(String[] args) {
        int count = 4;
        drawPattern(count);
    }

    public static void drawPattern(int count) {

         //*
         //* *
         //* * *
         //* * * *
        for (int i = 1; i <= count; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
