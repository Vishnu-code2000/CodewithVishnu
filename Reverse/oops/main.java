package Reverse.oops;

import java.util.Scanner;
// import java.lang.Override;

abstract class Shape {
    float area;

    abstract void acceptInput();

    abstract void calArea();

    public void disp() {
        System.out.println("The area is" + area);
    }

}

class Square extends Shape {

    private float side;

    @Override
    public void acceptInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the side");
        side = scan.nextFloat();

    }

    @Override
    void calArea() {
        area = side * side;
    }

}

class Rectangle extends Shape {

    private float length;
    private float breadth;

    @Override
    public void acceptInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length");
        length = scan.nextFloat();
        System.out.println("Enter the breadth");
        breadth = scan.nextFloat();

    }

    @Override
    void calArea() {
        area = length * breadth;
    }

}

class Circle extends Shape {

    private float radius;

    @Override
    public void acceptInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius");
        radius = scan.nextFloat();

    }

    @Override
    void calArea() {
        area = 3.142f * radius * radius;
    }

}

class Gemotry {

    public void permit(Shape ref) {
        ref.acceptInput();
        ref.calArea();
        ref.disp();
    }
}

public class main {
    public static void main(String[] args) {

        Square s = new Square();
        Rectangle r = new Rectangle();
        Circle c = new Circle();

        Gemotry g = new Gemotry();
        g.permit(s);
        g.permit(r);
        g.permit(c);

    }
}
