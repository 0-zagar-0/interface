package maate.academy;

import maate.academy.model.Circle;
import maate.academy.model.Rectangle;
import maate.academy.model.Square;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Square square1 = new Square();
        Square square2 = new Square();
        Rectangle rectangle = new Rectangle();

        System.out.println("Circle area = " + circle.getArea());
        System.out.println("Rectangle area = " + rectangle.getArea());
        System.out.println("Square1 area = " + square1.getArea());
        System.out.println("Square2 area = " + square2.getArea());
        System.out.println("Compare to square : " + square1.compareTo(square2));

    }
}