package W2Marker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClassroomApplication {

    public static void main(String[] args) {
        Marker blueMarker = new Marker("blue");
        blueMarker.paint();

        Marker redMarker = new Marker("red");
        redMarker.paint();

        redMarker.paint();

        List<String> names = new ArrayList<>();
        names.add("Sahar");
        names.add("Guillermo");
        names.add("Niklas");

        Collections.shuffle(names);

        System.out.println(names);

    }


}








