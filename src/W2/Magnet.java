package W2;

import W2.MagnetCalculator.CalculatorMagnet;

import java.util.Scanner;

public class Magnet {

    public static void main(String[] args) {
//        normalCalculator();
//        insistantCalculator();
//    }


//    private static void normalCalculator() {
//        Integer number1 = getNumber();
//        Integer number2 = getNumber();
//
//        Integer sum = number1 + number2;
//        System.out.println("The sum is: " + sum);
//    }

//    private static void insistantCalculator() {
        System.out.println("How many numbers do you want to sum?");

        Scanner scanner = new Scanner(System.in);
        Integer numberOfNumbers = scanner.nextInt();

        Integer sum = 0;
        for (Integer times = 0; times < numberOfNumbers; times++) {
            Integer number = CalculatorMagnet.getNumber();
            sum = sum + number;

        }
        System.out.println(sum);
    }

    public static Integer getNumber() {
        System.out.println("Tell me one number: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }


}






