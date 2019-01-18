package A;

import java.util.ArrayList;
import java.util.List;

public class BasicShapesApplication {
    public static void main(String[] args) {
        Shape circle=new Circle();
        Shape squar=new Squar();
        Shape triangle=new Triangle();

        System.out.println(circle.getName());
        System.out.println(squar.getName());
        System.out.println(triangle.getName());



        List<Shape>shapes=new ArrayList<>();
        shapes.add(circle);
        shapes.add(squar);
        shapes.add(triangle);
        System.out.println(shapes);

        for (Shape shape : shapes) {

            System.out.println(shape);


        }
    }


}
