package A;

import W5_3Colore.Colored;

import java.util.ArrayList;
import java.util.List;

public class BasicColorApplication {

    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle();

        System.out.println(rectangle.getColore());
        System.out.println(rectangle.getName());
        Colored colored = (Colored) rectangle;
        System.out.println(colored.getColore());
        Shape shape = (Shape) rectangle;
        System.out.println(shape.getName());

        List<Rectangle>rectangles=new ArrayList<>();
        List<Shape>shapes=new ArrayList<>();
        List<Colored>colores=new ArrayList<>();

        rectangles.add(rectangle);
        shapes.add(rectangle);
        shapes.add(shape);
        colores.add(rectangle);
        colores.add(colored);

        System.out.println(rectangles);
        System.out.println(colores);
        System.out.println(shapes);
    }






}
