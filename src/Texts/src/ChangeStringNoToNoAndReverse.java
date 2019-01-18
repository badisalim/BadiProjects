package Texts.src;

import java.util.Scanner;

public class ChangeStringNoToNoAndReverse {

public static void main(String[] args) {

    System.out.print("Input number : ");
    Scanner input = new Scanner(System.in);
    int num = input.nextInt();

    int reversed=0;
    for(;num !=0; num /= 10) {
        int digit = num % 10;
        reversed = reversed * 10 + digit;

    }
    System.out.println("Reversed Number: " + reversed );

    //Reverse Number*100
    while(num != 0) {
        int digit = num % 10;
        reversed = reversed * 10 + digit;
        num /= 10;
    }
    System.out.println("Reversed Number*100: " + reversed*100);

    //reverse String
    System.out.println("Enter string to reverse:");

    Scanner read = new Scanner(System.in);
    String str = read.nextLine();
    String reverse = "";

    for(int i = str.length() - 1; i >= 0; i--)
    {
        reverse = reverse + str.charAt(i);
        Integer reverse1=Integer.valueOf("0570");
        //reverse1=reverse.indexOf("01230");
        System.out.println("Reversed string is:");
        System.out.println(reverse1*2);
    }

    System.out.println("Reversed string is:");



    // Replace all the 'd' characters with 'f' characters.
    //12String new_str = str.replace('d', 'f');
    String new_str = str.replace("0", "1");
    // Display the strings for comparison.
    System.out.println("Original string: " + str);
    System.out.println("New String: " + new_str);

// Declare the source string
    String stringVal = "1100101";
    // Define the regex pattern
    String regex = "0";
    // Replacing all the occurrences of String "0"
    String objStr = stringVal.replaceAll("0", "1");
    System.out.println();
    System.out.println("Original String Object: "+stringVal);

    System.out.println("New String Object: "+objStr);

    System.out.println();
//new
    String n1 = objStr;
    String n2 = "200";
    String n3 = "366";
    System.out.println("'" + n1 + "'" + " + " + "'" + n2+ "'" + " + " + "'" + n3  + "'" + " = " + addStrings(n1, n2,n3));
}
public static String addStrings(String n1, String n2,String n3) {
    int[] x = str_num(n1);
    int[] y = str_num(n2);
    int[] w = str_num(n3);
    int[] sum = new int[Math.max(x.length, y.length) + 1];
    int z = 0;
    int index = sum.length - 1;
    int i = 0;
    int j = 0;
    int k = 0;
    while (index >= 0) {
        if (i < x.length) {
            z += x[i++];
        }
        if (j < y.length) {
            z += y[j++];
        }
        if (k < w.length) {
            z += w[k++];
        }
        sum[index--] = z % 10;
        z /= 10;
    }
    StringBuilder sb = new StringBuilder(sum.length);
    for (i = (sum[0] == 0 ? 1 : 0); i < sum.length; ++i) {
        sb.append(sum[i]);
    }
    return sb.toString();
}

private static int[] str_num(String num) {
    char[] digits = num.toCharArray();
    int[] number = new int[digits.length];
    int index = number.length - 1;
    for (char digit: digits) {
        number[index--] = digit - '0';
    }
    return number;
}
}



