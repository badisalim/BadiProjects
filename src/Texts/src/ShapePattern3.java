package Texts.src;

public class ShapePattern3 {

    private static void stars(int count) {
        for (int i = 0; i < count; ++i)
            System.out.print("*");
    }

    private static void spaces(int count) {
        for (int i = 0; i < count; ++i)
            System.out.print(" ");
    }

    public static void main(String[] args) {

        int n = 8;

        for (int i = 0; i < n; ++i) {
            stars(i + 1);
            spaces(n - i - 1);
            stars(n - i + 1);
            spaces(2 * i);
            stars(n - i);
            spaces(n - i - 1);
            stars(i + 1);

            System.out.println();
        }
    }
}