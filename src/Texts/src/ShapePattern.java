package Texts.src;

import java.util.Scanner;
    public class ShapePattern {

        public static void main(String[] args)


        {
            int i,j,r,k;
            System.out.print("Input number of rows (half of the diamond) : ");
            Scanner in = new Scanner(System.in);
            r = in.nextInt();


            for(i=0;i<=r;i++)
            {

     //this loop for top section
                for(j=1;j<=r-i;j++)
                    System.out.print(" ");
                for(j=1;j<=2*i-1;j++)
                    System.out.print("*");
    //this loop for second top section
                for(k=1;k<=(r-i)*2;k++)
                    System.out.print(" ");
                for(k=4;k<=2*i+2;k++)
                    System.out.print("*");
    //this loop for third top section
                for(k=1;k<=(r-i)*2;k++)
                    System.out.print(" ");
                for(k=8;k<=2*i+6;k++)
                    System.out.print("*");

    // this loop for top half section right
                for(j=-1;j<=r-i;j++)
                    System.out.print(" ");
                for(j=1;j<=2*i-1;j++)
                    System.out.print("*");

     //this loop for top left section
                for(k=1;k<=(r-i)*2;k++)
                    System.out.print(" ");

                for(k=1;k<=(r-i)*2;k++)
                    System.out.print(" ");
                for(k=4;k<=2*i+2;k++)
                System.out.print("*");
                System.out.print("\n");
            }
    //this loop for down section
            for(i=r-1;i>=1;i--)
            {
                for(j=1;j<=r-i;j++)
                    System.out.print(" ");
                for(j=1;j<=2*i-1;j++)
                    System.out.print("*");
                System.out.print("\n");
            }

        }
    }
