package A;

import W5_3Colore.Colored;

public class Rectangle implements Colored,Shape {

    @Override
    public String toString() {
        return "Rectangle{}";
    }

    @Override
    public String getColore() {
        return "violet";
    }

    @Override
    public String getName() {
        return "rectangle";
    }
}
