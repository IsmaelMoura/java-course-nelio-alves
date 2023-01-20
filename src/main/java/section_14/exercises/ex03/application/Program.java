package section_14.exercises.ex03.application;

import section_14.exercises.ex03.model.entities.Circle;
import section_14.exercises.ex03.model.entities.Rectangle;
import section_14.exercises.ex03.model.entities.Shape;
import section_14.exercises.ex03.model.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Shape> list = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Shape #" + i + " data: ");
            System.out.print("Rectangle or Circle (r/c)? ");
            char shapeType = sc.next().charAt(0);

            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());

            if (shapeType == 'r') {
                System.out.print("Width: ");
                double width = sc.nextDouble();

                System.out.print("Height: ");
                double height = sc.nextDouble();

                list.add(new Rectangle(color, width, height));
            } else {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();

                list.add(new Circle(color, radius));
            }
        }

        System.out.println("\nSHAPE AREAS: ");

        for (Shape shape : list) {
            System.out.printf("%.2f%n", shape.area());
        }

        sc.close();
    }
}
