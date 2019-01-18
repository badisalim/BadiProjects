package EncrDecr.EncrDecr1;

import java.util.Scanner;

public class Encryption1 {

    public static void main(String args[ ])
    {
        String str,Newstr=" ";
        System.out.print("Enter the String you want to Encrypt: ");
        try {

            Scanner in=new Scanner(System.in);
            str=in.nextLine();
            for (int i=0;i<str.length();i++)
            {
                char ch=new Character(str.charAt(i));
                // char ch1=Character.toUpperCase(str.charAt(i));
                switch (ch)
                {
                    case '?':
                        Newstr=Newstr+" ";
                        break;
                    case 'a':
                        Newstr=Newstr+"g";
                        break;
                    case 'b':
                        Newstr=Newstr+"h";
                        break;
                    case 'c':
                        Newstr=Newstr+"n";
                        break;
                    case 'd':
                        Newstr=Newstr+"o";
                        break;
                    case 'e':
                        Newstr=Newstr+"p";
                        break;
                    case 'f':
                        Newstr=Newstr+"w";
                        break;
                    case 'g':
                        Newstr=Newstr+"i";
                        break;
                    case 'h':
                        Newstr=Newstr+"j";
                        break;
                    case 'i':
                        Newstr=Newstr+"q";
                        break;
                    case 'j':
                        Newstr=Newstr+"x";
                        break;
                    case 'k':
                        Newstr=Newstr+"a";
                        break;
                    case 'l':
                        Newstr=Newstr+"f";
                        break;
                    case 'm':
                        Newstr=Newstr+"d";
                        break;
                    case 'n':
                        Newstr=Newstr+"z";
                        break;
                    case 'o':
                        Newstr=Newstr+"y";
                        break;
                    case 'p':
                        Newstr=Newstr+"r";
                        break;
                    case 'q':
                        Newstr=Newstr+"s";
                        break;
                    case 'r':
                        Newstr=Newstr+"t";
                        break;
                    case 's' :
                        Newstr=Newstr+"u";
                        break;
                    case 't':
                        Newstr=Newstr+"v";
                        break;
                    case 'u':
                        Newstr=Newstr+"k";
                        break;
                    case 'v' :
                        Newstr=Newstr+"m";
                        break;
                    case 'w':
                        Newstr=Newstr+"b";
                        break;
                    case 'x' :
                        Newstr=Newstr+"c";
                        break;
                    case 'y':
                        Newstr=Newstr+"e";
                        break;
                    case 'z' :
                        Newstr=Newstr+"l";
                        break;
                    case 'A':
                        Newstr=Newstr+"B";
                        break;
                    case 'B':
                        Newstr=Newstr+"C";
                        break;
                    case 'C':
                        Newstr=Newstr+"D";
                        break;
                    case 'D':
                        Newstr=Newstr+"E";
                        break;
                    case 'E':
                        Newstr=Newstr+"F";
                        break;
                    case 'F':
                        Newstr=Newstr+"G";
                        break;
                    case 'G':
                        Newstr=Newstr+"H";
                        break;
                    case 'H':
                        Newstr=Newstr+"I";
                        break;
                    case 'I':
                        Newstr=Newstr+"J";
                        break;
                    case 'J':
                        Newstr=Newstr+"K";
                        break;
                    case 'K':
                        Newstr=Newstr+"L";
                        break;
                    case 'L':
                        Newstr=Newstr+"M";
                        break;
                    case 'M':
                        Newstr=Newstr+"N";
                        break;
                    case 'N':
                        Newstr=Newstr+"O";
                        break;
                    case 'O':
                        Newstr=Newstr+"P";
                        break;
                    case 'P':
                        Newstr=Newstr+"Q";
                        break;
                    case 'Q':
                        Newstr=Newstr+"R";
                        break;
                    case 'R':
                        Newstr=Newstr+"S";
                        break;
                    case 'S':
                        Newstr=Newstr+"T";
                        break;
                    case 'T':
                        Newstr=Newstr+"U";
                        break;
                    case 'U':
                        Newstr=Newstr+"V";
                        break;
                    case 'V':
                        Newstr=Newstr+"W";
                        break;
                    case 'W':
                        Newstr=Newstr+"X";
                        break;
                    case 'X':
                        Newstr=Newstr+"Y";
                        break;
                    case 'Y':
                        Newstr=Newstr+"Z";
                        break;
                    case 'Z':
                        Newstr=Newstr+"A";
                        break;
                    case '1':
                        Newstr=Newstr+"5";
                        break;
                    case '2':
                        Newstr=Newstr+"6";
                        break;
                    case '3':
                        Newstr=Newstr+"7";
                        break;
                    case '4':
                        Newstr=Newstr+"8";
                        break;
                    case '5':
                        Newstr=Newstr+"9";
                        break;
                    case '6':
                        Newstr=Newstr+"0";
                        break;
                    case '7':
                        Newstr=Newstr+"1";
                        break;
                    case '8':
                        Newstr=Newstr+"2";
                        break;
                    case '9':
                        Newstr=Newstr+"3";
                        break;
                    case '0':
                        Newstr=Newstr+"4";
                        break;

                }


            }
        }
        catch(Exception ioe)
        {
            ioe.printStackTrace();
        }
        System.out.println("The encrypted string is: \n" +Newstr);
    }
}

