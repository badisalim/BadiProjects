package W2;

import java.util.ArrayList;
import java.util.List;

//import java.util.Scanner;
//import java.util.ArrayList;
public class RemoveDublicatNoFromCollection {
    public static void main(String[] args) {
        //example input
        int input[] = new int[]{1, 6 , 5896, 5896, 9, 100,7, 1000, 8, 9, 0, 10, 90, 4};
        //use list because the size is dynamical can change
        List<Integer> result = new ArrayList<Integer>();

        for(int i=0; i<input.length; i++)
        {
            boolean match = false;
            for(int j=0; j<result.size(); j++)
            {
                //if the list contains any input element make match true
                if(result.get(j) == input[i])
                    match = true;
            }
            //if there is no matching we can add the element to the result list
            if(!match)
                result.add(input[i]);
        }
        // Print the result
        for(int i=0; i<result.size(); i++)
            System.out.print(result.get(i) + ", ");

    }
}