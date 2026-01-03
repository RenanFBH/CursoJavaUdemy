package udemyjava.javacompleto.intermediario.parte2.secao13.test;

import udemyjava.javacompleto.intermediario.parte2.secao13.entities.Circle;
import udemyjava.javacompleto.intermediario.parte2.secao13.entities.Rectangle;
import udemyjava.javacompleto.intermediario.parte2.secao13.entities.Shape;
import udemyjava.javacompleto.intermediario.parte2.secao13.entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramTest05 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        List<Shape> list = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Shape #" + i + " data:");
            System.out.print("Rectangle or Circle (r/c)? ");
            char type = input.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(input.next());
            if (type == 'r') {
                System.out.print("Width: ");
                double width = input.nextDouble();
                System.out.print("Height: ");
                double height = input.nextDouble();
                list.add(new Rectangle(color, width, height));
            } else {
                System.out.print("Radius: ");
                double radius = input.nextDouble();
                list.add(new Circle(color, radius));
            }
        }
        System.out.println();
        System.out.println("SHAPE AREAS:");
        for (Shape shape : list) {
            System.out.println(String.format("%.2f", shape.area()));
        }

        input.close();

    }
}
