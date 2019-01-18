package W2.simpleclasses;

public class Marker {

    private String color;

    public Marker(String color) {
        this.color = color;
        System.out.println("I'm building a marker color " + color);
    }

    public void paint() {
        System.out.println("I paint with color " + color);
    }

}
