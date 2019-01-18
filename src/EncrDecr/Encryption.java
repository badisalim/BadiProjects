package EncrDecr;

import java.util.Scanner;

public class Encryption {

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
                        case ' ':
                            Newstr=Newstr+" ";
                            break;
                        case 'a':
                            Newstr=Newstr+"b";
                            break;
                        case 'b':
                            Newstr=Newstr+"c";
                            break;
                        case 'c':
                            Newstr=Newstr+"d";
                            break;
                        case 'd':
                            Newstr=Newstr+"e";
                            break;
                        case 'e':
                            Newstr=Newstr+"f";
                            break;
                        case 'f':
                            Newstr=Newstr+"g";
                            break;
                        case 'g':
                            Newstr=Newstr+"h";
                            break;
                        case 'h':
                            Newstr=Newstr+"i";
                            break;
                        case 'i':
                            Newstr=Newstr+"j";
                            break;
                        case 'j':
                            Newstr=Newstr+"k";
                            break;
                        case 'k':
                            Newstr=Newstr+"l";
                            break;
                        case 'l':
                            Newstr=Newstr+"m";
                            break;
                        case 'm':
                            Newstr=Newstr+"n";
                            break;
                        case 'n':
                            Newstr=Newstr+"o";
                            break;
                        case 'o':
                            Newstr=Newstr+"p";
                            break;
                        case 'p':
                            Newstr=Newstr+"q";
                            break;
                        case 'q':
                            Newstr=Newstr+"r";
                            break;
                        case 'r':
                            Newstr=Newstr+"s";
                            break;
                        case 's' :
                            Newstr=Newstr+"t";
                            break;
                        case 't':
                            Newstr=Newstr+"u";
                            break;
                        case 'u':
                            Newstr=Newstr+"v";
                            break;
                        case 'v' :
                            Newstr=Newstr+"w";
                            break;
                        case 'w':
                            Newstr=Newstr+"x";
                            break;
                        case 'x' :
                            Newstr=Newstr+"y";
                            break;
                        case 'y':
                            Newstr=Newstr+"z";
                            break;
                        case 'z' :
                            Newstr=Newstr+"a";
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

