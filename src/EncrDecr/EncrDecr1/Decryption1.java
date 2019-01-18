package EncrDecr.EncrDecr1;

import java.util.Scanner;

class Decryption1 {


    public static void main(String args[]) {
        String str;
        String Newstr = " ";
        System.out.print("Enter the String you want to Encrypt: ");
        try {
            Scanner in = new Scanner(System.in);
            str = in.nextLine();

            for (int i = 0; i < str.length(); i++) {
                char ch = new Character(str.charAt(i));
                char ch1 = Character.toUpperCase(str.charAt(i));
                switch (ch) {
                    case 'b':
                        Newstr = Newstr + "w";
                        break;
                    case 'x':
                        Newstr = Newstr + " ";
                        break;
                    case 'c':
                        Newstr = Newstr + "x";
                        break;
                    case 'd':
                        Newstr = Newstr + "m";
                        break;
                    case 'e':
                        Newstr = Newstr + "y";
                        break;
                    case 'f':
                        Newstr = Newstr + "l";
                        break;
                    case 'g':
                        Newstr = Newstr + "a";
                        break;
                    case 'h':
                        Newstr = Newstr + "b";
                        break;
                    case 'i':
                        Newstr = Newstr + "g";
                        break;
                    case 'j':
                        Newstr = Newstr + "h";
                        break;
                    case 'k':
                        Newstr = Newstr + "u";
                        break;
                    case 'l':
                        Newstr = Newstr + "z";
                        break;
                    case 'm':
                        Newstr = Newstr + "v";
                        break;
                    case 'n':
                        Newstr = Newstr + "c";
                        break;
                    case 'o':
                        Newstr = Newstr + "d";
                        break;
                    case 'p':
                        Newstr = Newstr + "e";
                        break;
                    case 'q':
                        Newstr = Newstr + "i";
                        break;
                    case 'r':
                        Newstr = Newstr + "p";
                        break;
                    case 's':
                        Newstr = Newstr + "q";
                        break;
                    case 't':
                        Newstr = Newstr + "r";
                        break;
                    case 'u':
                        Newstr = Newstr + "s";
                        break;
                    case 'v':
                        Newstr = Newstr + "t";
                        break;
                    case 'w':
                        Newstr = Newstr + "f";
                        break;
                    case ' ':
                        Newstr = Newstr + "j";
                        break;
                    case 'y':
                        Newstr = Newstr + "o";
                        break;
                    case 'z':
                        Newstr = Newstr + "n";
                        break;
                    case 'a':
                        Newstr = Newstr + "k";
                        break;
                    case 'A':
                        Newstr = Newstr + "Z";
                        break;
                    case 'B':
                        Newstr = Newstr + "A";
                        break;
                    case 'C':
                        Newstr = Newstr + "B";
                        break;
                    case 'D':
                        Newstr = Newstr + "C";
                        break;
                    case 'E':
                        Newstr = Newstr + "D";
                        break;
                    case 'F':
                        Newstr = Newstr + "E";
                        break;
                    case 'G':
                        Newstr = Newstr + "F";
                        break;
                    case 'H':
                        Newstr = Newstr + "G";
                        break;
                    case 'I':
                        Newstr = Newstr + "H";
                        break;
                    case 'J':
                        Newstr = Newstr + "I";
                        break;
                    case 'K':
                        Newstr = Newstr + "G";
                        break;
                    case 'L':
                        Newstr = Newstr + "K";
                        break;
                    case 'M':
                        Newstr = Newstr + "L";
                        break;
                    case 'N':
                        Newstr = Newstr + "M";
                        break;
                    case 'O':
                        Newstr = Newstr + "N";
                        break;
                    case 'P':
                        Newstr = Newstr + "O";
                        break;
                    case 'Q':
                        Newstr = Newstr + "P";
                        break;
                    case 'R':
                        Newstr = Newstr + "Q";
                        break;
                    case 'S':
                        Newstr = Newstr + "R";
                        break;
                    case 'T':
                        Newstr = Newstr + "S";
                        break;
                    case 'U':
                        Newstr = Newstr + "T";
                        break;
                    case 'V':
                        Newstr = Newstr + "U";
                        break;
                    case 'W':
                        Newstr = Newstr + "V";
                        break;
                    case 'X':
                        Newstr = Newstr + "W";
                        break;
                    case 'Y':
                        Newstr = Newstr + "X";
                        break;
                    case 'Z':
                        Newstr = Newstr + "Y";
                        break;
                    case '5':
                        Newstr = Newstr + "1";
                        break;
                    case '6':
                        Newstr = Newstr + "2";
                        break;
                    case '7':
                        Newstr = Newstr + "3";
                        break;
                    case '8':
                        Newstr = Newstr + "4";
                        break;
                    case '9':
                        Newstr = Newstr + "5";
                        break;
                    case '0':
                        Newstr = Newstr + "6";
                        break;
                    case '1':
                        Newstr = Newstr + "7";
                        break;
                    case '2':
                        Newstr = Newstr + "8";
                        break;
                    case '3':
                        Newstr = Newstr + "9";
                        break;
                    case '4':
                        Newstr = Newstr + "0";
                        break;
                }
            }
        } catch (Exception ioe) {
            ioe.printStackTrace();
        }
        System.out.println("The encrypted string is: \n" + Newstr);
    }
}