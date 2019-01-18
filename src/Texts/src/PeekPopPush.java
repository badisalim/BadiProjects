package Texts.src;

import java.util.*;
    public class PeekPopPush {
        public static void main(String args[]) {

            // creating stack

            Stack st = new Stack();

            // populating stack
            st.push("Java");
            st.push("Source");
            st.push("code");

            // checking the top object
            System.out.println("Initial Stack: " + st);
            System.out.println("Top object is: "+st.peek());
            System.out.println("Top object is removed: "+st.pop());
            System.out.println("Final Stack: " + st);
            Stack<Integer> STACK = new Stack<Integer>();




        }
    }

