import java.util.Scanner;

abstract class Shape {
    int a, b; 
    abstract void printArea(); 
}

class Rectangle extends Shape {
    Rectangle() {
        System.out.println("Enter the dimensions of the rectangle (length and breadth):");
        Scanner s = new Scanner(System.in);
        a = s.nextInt(); 
        b = s.nextInt(); 
    }

    void printArea() {
        double area = a * b;
        System.out.println("Area of Rectangle = " + area);
    }
}

class Triangle extends Shape {
    Triangle() {
        System.out.println("Enter the dimensions of the triangle (base and height):");
        Scanner s = new Scanner(System.in);
        a = s.nextInt(); 
        b = s.nextInt(); 
    }

    void printArea() {
        double area = 0.5 * a * b;
        System.out.println("Area of Triangle = " + area);
    }
}

class Circle extends Shape {
    Circle() {
        System.out.println("Enter the dimension of the circle (radius):");
        Scanner s = new Scanner(System.in);
        a = s.nextInt(); 
    }

    void printArea() {
        double area = 3.142 * a * a;
        System.out.println("Area of Circle = " + area);
    }
}

public class MainShape {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Triangle t = new Triangle();
        Circle c = new Circle();

        r.printArea();
        t.printArea();
        c.printArea();
    }
}
