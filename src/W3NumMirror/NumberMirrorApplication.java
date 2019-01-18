package W3NumMirror;
import java.util.Scanner;

public class NumberMirrorApplication {

    public static void main(String[] args) {
        NumberMirror numberMirror = new NumberMirror();

        System.out.print("Write a number: ");
        Scanner scanner = new Scanner(System.in);
        Integer number = scanner.nextInt();
        Integer mirrored = numberMirror.mirror(number);
        Integer mirroredSpecially = numberMirror.specialMirror(number);
        System.out.println("Original: " + number);
        System.out.println("Mirrored: " + mirrored);
        System.out.println("Special: " + mirroredSpecially);
    }

}
//import java.util.Scanner;
//
//public class NumberMirrorApplication {
//
//    public static void main(String[] args) {
//      int num = 0;
//        int reversenum = 0;
//        System.out.println("Input your number and press enter: ");
//
//
//        Scanner in = new Scanner(System.in);
//
//        num = in.nextInt();
//
//        while (num != 0) {
//            reversenum = reversenum * 10;
//            reversenum = reversenum + num % 10;
//            num = num / 10;
//        }
//
//        System.out.println("Reverse of input number is: " + reversenum);
//    }
//}


//    public static void main(String[] args) {
//
//        int num = 1234, reversed = 0;
//
//        while(num != 0) {
//            int digit = num % 10;
//            reversed = reversed * 10 + digit;
//            num /= 10;
//        }
//
//        System.out.println("Reversed Number: " + reversed);
//    }
//}

