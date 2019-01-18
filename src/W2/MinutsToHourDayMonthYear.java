package W2;

import java.util.Scanner;

public class MinutsToHourDayMonthYear {

    public static void main(String[] Strings) {


        double minutesInYear = 60 * 24 * 365;

        Scanner input = new Scanner(System.in);

        System.out.print("Input the number of minutes: ");

        double min = input.nextDouble();

        long years = (long) (min / minutesInYear);
        int monthes = (int) (min / 60 / 24 / 30) % 12;
        int days = (int) (min / 60 / 24) % 30;
        int hours = (int) (min  / 60) % 24;

        System.out.println((int) min + " minutes is approximately " + years + " years and " + monthes + " monthes and " + days + " days and " + hours + " hours" );
    }
}