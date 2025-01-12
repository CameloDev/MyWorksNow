package org.oppIntroduct;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(10);
        System.out.println(circle.toString());

        Shape rectangle = new Rectangle(15, 7);
        System.out.println(rectangle.toString());

        Shape square = new Square(2);
        System.out.println(square.toString());

        Shape equilateralTriangle = new EquilateralTriangle(7);
        System.out.println(equilateralTriangle.toString());
    }
}
