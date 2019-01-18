package Texts.src;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;

public class ReversCutCalculateStr {
    public static void main(String[] args) {


        // Write your code Current Date time
        System.out.format("\nCurrent Date time: %tc%n\n", System.currentTimeMillis());

        // Write your code Current Date time
        SimpleDateFormat cdt = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
        cdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));
        System.out.println("\nNow: "+cdt.format(System.currentTimeMillis()));

        System.out.print("\n");
        // Write your code Input first and second Name
        Scanner input = new Scanner (System.in);
        System.out.print("Input your first name: ");
        String fname = input.next();
        System.out.print("Input your last name: ");
        String lname = input.next();
        System.out.println();
        System.out.println("Hello \n"+fname+" "+lname);

        System.out.print("\n");
        // Write your code Remove First Letter from each String
        String str1 = "Badi";
        String str2 = "Raslan";

        System.out.println(str1.substring(1) + str2.substring(1));

        System.out.print("\n");
// Write your code Cut Half String
        String main_string = "BadiRaslan";
        System.out.println(main_string.substring(0, main_string.length()/2));

        System.out.print("\n");
// Write your code Revers
        Scanner in = new Scanner(System.in);
        System.out.print("\nInput a word: ");
        String word = in.nextLine();
        word = word.trim();
        String result = "";
        char[] ch=word.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            result += ch[i];
        }
        System.out.println("Reverse word: "+result.trim());

        System.out.print("\n");
        // Write your code Lowercase
        System.out.print("Input a String: ");

        String line = in.nextLine();
        line = line.toLowerCase();
        System.out.print("LowerCase: ");
        System.out.println(line);

        // Write your code uppercase
        System.out.print("UpperCase: ");


        line = line.toUpperCase();
        System.out.println(line);

        System.out.print("\n");
// Write your code Welcom Name {
        // System.out.println("Hello\nBadi Raslan!");
        System.out.println("Hello\n"+word+line);
        System.out.print("\n");
// Write your code Arrange text {
        System.out.println("\nTwinkle, twinkle, little star, \n\tHow I wonder what you are! \n\t\tUp above the world so high, \n\t\tLike a diamond in the sky. \nTwinkle, twinkle, little star, \n\tHow I wonder what you are!\n\n");

        System.out.print("\n");
// Write your code No.Of Letters,Numbers,space,others..
        String test = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
        count(test);
    }
    public static void count(String x){
        char[] ch = x.toCharArray();
        int letter = 0;
        int space = 0;
        int num = 0;
        int other = 0;
        for(int i = 0; i < x.length(); i++){
            if(Character.isLetter(ch[i])){
                letter ++ ;
            }
            else if(Character.isDigit(ch[i])){
                num ++ ;
            }
            else if(Character.isSpaceChar(ch[i])){
                space ++ ;
            }
            else{
                other ++;
            }
        }
        System.out.println("The string is : Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33");
        System.out.println("letter: " + letter);
        System.out.println("space: " + space);
        System.out.println("number: " + num);
        System.out.println("other: " + other);

        System.out.print("\n");


        System.out.print("\n");



    }
}















