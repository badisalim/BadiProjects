package W2;

import java.util.Scanner;
public class wBoolean {

    public static void main(String[] args) {
        isWearingAHat();
        isBringingAPet();
        if (!isWearingAHat() && !isBringingAPet()) {
            System.out.println("you Welcom");

                  System.out.println("you get No for you" );
        }
          else { int a,b,sum;
            a=2;
            b=3;
            sum=a+b;
            System.out.println("sorryNot Welcom");
            System.out.println(" No ticket number" +sum);
        }
    }
    public static Boolean isWearingAHat () {

            System.out.println("are you wearing a hat");

            Scanner scanner = new Scanner(System.in);
          String answer = scanner.nextLine();
            return answer.equals("yes");


        }
    public static Boolean isBringingAPet () {

            System.out.println("Are you Bringing pet?:");
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();
            return answer.equals("yes");
      // Integer money=DerekRestaurantTreat.getMoney();


        }


    }

















