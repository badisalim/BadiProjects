package A;
import java.util.ArrayList;
import java.util.Scanner;

public class BB {
    Scanner in;
    ArrayList<Double> inputs;

    public BB() {
        this.in = new Scanner(System.in);
        this.inputs = new ArrayList();
    }

    public static void main(String[] args) {
        int a = 1236;
        int b = -1234;
        String str1 = Integer.toString(a);
        String str2 = Integer.toString(b);
        System.out.println("String str1 = " + str1);
        System.out.println("String str2 = " + str2);
        System.out.println(a + b + " " + str1 + str2);
    }
}
