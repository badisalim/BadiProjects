package W2;

import W2.MagnetCalculator.CalculatorMagnet;

import java.util.Scanner;


public class WearingHat {

    public static void main(String[] args) {
        isWearingAHat();
        isBringingAPet();
        Integer freinds = CalculatorMagnet.sumNumber();
        Integer money = DerekRestaurantTreat.getNumberOfFriends();
        Integer number = InsistantCalculatorMagnet.sumNumbers();


        if (isWearingAHat() && !isBringingAPet()) {
            System.out.println("Welcome to our cinema, how may I assist you?");
        } else {
            System.out.println("I’m sorry, but you’re not allowed to enter.");
        }
    }

    public static Boolean isWearingAHat() {
        System.out.println("Are you wearing a hat?");

        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();

        return answer.equals("yes");
    }

    public static Boolean isBringingAPet() {
        System.out.println("Are you bringing a pet?");

        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();

        return answer.equals("yes");
    }

    {
       // public static void main (String[]args){




    }
    }
