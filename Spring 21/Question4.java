import java.awt.*;
import java.util.Random;

public class Question4 {
    public static void printNumber(String className) {
        if (className.equals("Rectangle")) {
            System.out.println("Num of Rectangles: " + Rectangle.getCountRect());
        } else if (className.equals("Triangle")) {
            System.out.println("Num of Triangles: " + Triangle.getCountTriangles());
        } else if (className.equals("Shape")) {
            System.out.println("Num of shapes: " + Shape.getCount());
        }
    }

    public static void getShapesArea(Shape[] shapes) {
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i].toString() + " " + i + " area: " + shapes[i].getArea());
        }
    }


    public static void main(String[] args) throws InvalidNumberException {
        Rectangle[] rects = new Rectangle[10];
        Triangle[] triangles = new Triangle[7];
        Random rand = new Random();
        for (int i = 0; i < rects.length; i++) {
            rects[i] = new Rectangle(Color.RED, rand.nextDouble()*100, rand.nextDouble()*100);
        }
        for (int i = 0; i < triangles.length; i++) {
            triangles[i] = new Triangle(Color.BLUE, rand.nextDouble()*100, rand.nextDouble()*100);
        }

        getShapesArea(triangles);
        System.out.println("*___________________________*");
        getShapesArea(rects);
        System.out.println("*___________________________*");
        printNumber("Rectangle");
        printNumber("Triangle");
        printNumber("Shape");

    }
}

abstract class Shape {
    private static int count;
    private Color color;

    Shape(Color color) {
        this.color = color;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public abstract double getArea();

    @Override
    public String toString() {
        return "Shape";
    }
}

class Rectangle extends Shape {
    private static int countRect;
    private double width;
    private double height;


    public Rectangle(Color color, double width, double height) throws InvalidNumberException {
        super(color);
        if (width < 0 || height < 0) {
            throw new InvalidNumberException();
        } else {
            this.width = width;
            this.height = height;
        }
        countRect++;
    }

    public static int getCountRect() {
        return countRect;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle";
    }

}

class Triangle extends Shape {
    private static int countTriangles;
    private double base;
    private double height;

    public Triangle(Color color, double base, double height) throws InvalidNumberException {
        super(color);
        if (height < 0 || base < 0) {
            throw new InvalidNumberException();
        } else {
            this.base = base;
            this.height = height;
        }
        countTriangles++;
    }

    public static int getCountTriangles() {
        return countTriangles;
    }

    @Override
    public String toString() {
        return "Triangle";
    }

    @Override
    public double getArea() {
        return (0.5 * height * base);
    }
}

class InvalidNumberException extends Exception {
    public InvalidNumberException() {
        super();
    }
}

