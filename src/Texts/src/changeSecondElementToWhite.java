package Texts.src;

import java.util.ArrayList;
    public class changeSecondElementToWhite {


        public static void main(String[] args) {



//replace second element with white

            ArrayList<String>  color = new ArrayList<String>();

            color.add("Red");
            color.add("Green");
            color.add("Blue");
            System.out.println("Original array list: " + color);
            String new_color = "White";
            color.set(1,new_color);
            int num1=color.size();
            System.out.println("Replace second element with 'White'.");
            for(int i=0;i<num1;i++)
                System.out.println(color.get(i));




        }
    }




















