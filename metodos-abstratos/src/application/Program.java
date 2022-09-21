package application;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Shape #" + (i + 1) + " data:");
            System.out.print("Rectangle or Circle (r/c)? ");
            char choice = sc.next().charAt(0);
            System.out.print("Color (Black/Blue/Red): ");
            String color = sc.next().toUpperCase();

            if (choice == 'r') {
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                Shape shape = new Rectangle(Color.valueOf(color), width, height);
                shapes.add(shape);
            }
            else {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                Shape shape = new Circle(Color.valueOf(color), radius);
                shapes.add(shape);
            }
        }

        System.out.println();
        System.out.println("SHAPE AREAS: ");
        for (Shape s : shapes) {
            System.out.println(String.format("%.2f", s.area()));
        }
    }
}
