package patterns;

public class RectanglePattern {
    public static void main(String[] args) {
        int width = 4;
        int height = 3;
        drawPattern(width, height);
    }

    public static void drawPattern(int width, int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
