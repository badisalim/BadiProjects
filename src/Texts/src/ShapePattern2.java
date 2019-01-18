package Texts.src;

public class ShapePattern2 {
    public static void main(String[] args) {
        for (int row = 8; row >= 1; --row) {
            for (int col = 1; col <= row; ++col) {
                System.out.print("*");
            }

            System.out.println();
        }
        for (int row = 1; row <= 8; ++row) {
            for (int col = 1; col <= row; ++col) {
                System.out.print("*");
            }

            System.out.println();
        }
        int number = 7;
        int count = number - 1;
        for (int k = 1; k <= number; k++) {
            for (int i = 1; i <= count; i++)
                System.out.print(" ");
            count--;
            for (int i = 1; i <= 2 * k - 1; i++)
                System.out.print("*");
            System.out.println();

        }

        int number1 = 5;
        int count1 = number1 - 1;
        for (int k = 1; k <= number1; k++) {
            for (int i = 1; i <= count1; i++)
                System.out.print(" ");
            count1--;
            for (int i = 1; i <= 2 * k - 1; i++)
                System.out.print("*");
            System.out.println();
        }
        count1 = 1;
        for (int k = 1; k <= number1 - 1; k++) {
            for (int i = 1; i <= count1; i++)
                System.out.print(" ");
            count1++;
            for (int i = 1; i <= 2 * (number1 - k) - 1; i++)
                System.out.print("*");
            System.out.println();

        }

        int val = 8;
        for (int i = 1; i <= val; i++) {
            for (int j = 1; j <= val - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println("");

        }

        int number2 = 7;

        for (int i = 0; i < number2; i++) {
            if (i == 0 || i == 6) {
                for (int j = 0; j < number2; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            if (i >= 1 && i <= 5) {
                for (int j = 0; j < number2; j++) {
                    if (j == 0 || j == 6) {
                        System.out.print("*");
                    } else if (j >= 1 && j <= 5) {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

        }
    }
}