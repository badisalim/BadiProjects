package W2.simpleclasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentsApplication {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Sahar");
        names.add("Guillermo");
        names.add("Niklas");

        Collections.shuffle(names);

        System.out.println(names);
    }

}
