package W2.MagnetCalculator;

import java.util.Scanner;

public class InsistantCalculatorMagnet {
    public static void main(String[] args) {
        sumNumbers();

    }

    public static Integer sumNumbers() {
        System.out.println("How many numbers do you want to sum?");
        Scanner scanner = new Scanner(System.in);
        Integer numberOfNumbers = scanner.nextInt();
        Integer sum = 0;

        for (Integer times = 0; times < numberOfNumbers; times++) {
            Integer number = CalculatorMagnet.getNumber();
            sum = sum + number;


        }
        System.out.println("The result " + sum);
        return sum;
    }




}



