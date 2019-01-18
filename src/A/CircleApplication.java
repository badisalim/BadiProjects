package A;

public class CircleApplication {

    public static void main(String[] args) {
        Circle circle=new Circle();
        Shape shape=new Circle();
        Shape anothershape=new Circle();

        System.out.println("Class: "+circle.getName());
        System.out.println("Shape: "+shape.getName());
        System.out.println("AnotherShape: "+anothershape.getName());
    }


}
