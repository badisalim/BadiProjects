package Texts.src;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;

    public class Strings {

        public static void main(String[] args) {

// Write your code Current Date time
            System.out.format("\nCurrent Date time: %tc%n\n", System.currentTimeMillis());

            // Write your code Current Date time
            SimpleDateFormat cdt = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
            cdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));
            System.out.println("\nNow: "+cdt.format(System.currentTimeMillis()));

// Write your code Input first and second Name
            Scanner input = new Scanner (System.in);
            System.out.print("Input your first name: ");
            String fname = input.next();
            System.out.print("Input your last name: ");
            String lname = input.next();
            System.out.println();
            System.out.println("Hello \n"+fname+" "+lname);
// Write your code Revers
            //    Scanner in = new Scanner(System.in);
            //  System.out.print("\nInput a word: ");
//	 String word = in.nextLine();
            //lname=lname.trim();
            String main_string = fname+lname;
            main_string=main_string.trim();
            // word = word.trim();
            String result = "";
            //  char[] ch=word.toCharArray();
            char[] ch=main_string.toCharArray();
            for (int i = ch.length - 1; i >= 0; i--) {
                result += ch[i];
            }
            System.out.println("Reverse word: "+result.trim());
            // Write your code Lowercase
            System.out.print("Lower Case word: ");

            String line = main_string;
            line = line.toLowerCase();
            System.out.println(line);

            // Write your code uppercase
            System.out.print("UpperCase word: ");

            line = line.toUpperCase();
            System.out.println(line);

            // Write your code Remove First Letter from each String
            String str1 = fname;
            String str2 = lname;

            System.out.println("Remove First and last:"+str1.substring(1) + str2.substring(1));


// Write your code Cut Half String
            //     String main_string = fname+lname;
            System.out.println("Cut Half:"+ main_string.substring(0, main_string.length()/2));





// Write your code Welcom Name {
            System.out.println("Hello\nBadi Raslan!");

// Write your code Arrange text {
            System.out.println("\nTwinkle, twinkle, little star, \n\tHow I wonder what you are! \n\t\tUp above the world so high, \n\t\tLike a diamond in the sky. \nTwinkle, twinkle, little star, \n\tHow I wonder what you are!\n\n");

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



        }
    }














