import java.util.Arrays;

public class Question3 {
    final int x = 3;
    private static void printShapes(Shape[] shapes) {
        for (Shape shape : shapes) {
            shape.printData();
        }
    }
    public static void main(String[] args) {
        try {
            Triangle t = new Triangle(2, 5);
            Square s = new Square(4.5f);
            Rectangle r = new Rectangle(2.2f, 5);

            Shape[] shapes = {t, s, r};
            System.out.println("Not Sorted: ");
            printShapes(shapes);

            Arrays.sort(shapes);
            System.out.println("Sorted: ");
            printShapes(shapes);

            Rectangle r2 = new Rectangle(1, 5);
            System.out.println(s.equals(t)); // false
            System.out.println(t.equals(r2)); // true

            Thread thread = new Thread(r2);
            thread.start();
            thread.join();
            r2.printData();

            Triangle objectForExceptionTest = new Triangle(-2,4);
        } catch (InvalidEntryException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

abstract class Shape implements Comparable<Shape>, Runnable {
    protected float side1;
    protected float side2;

    public abstract float getArea();

    public abstract void printData();

    public void increment() {
        side1++;
        side2++;
    }

    @Override
    public void run() {
        increment();
    }

    @Override
    public int compareTo(Shape o) {
        if (this.getArea() > o.getArea()) {
            return 1;
        } else if (this.getArea() < o.getArea()) {
            return -1;
        } else {
            return 0;
        }

        // Note you can replace this implementation using 1 line
        // return Float.compare(this.getArea(), o.getArea());
    }

    @Override
    public boolean equals(Object obj) {
        return this.getArea() == ((Shape) obj).getArea();
    }
}

class Triangle extends Shape implements Runnable {
    public Triangle(float base, float height) throws InvalidEntryException {
        if (base > 0 && height > 0) {
            this.side1 = base;
            this.side2 = height;
        } else {
            throw new InvalidEntryException();
        }
    }
    @Override
    public float getArea() {
        return side1 * side2 / 2.0f; // 1/2 * base * height
    }

    @Override
    public void printData() {
        System.out.println("Triangle{" +
                "base= " + side1 +
                ", height= " + side2 +
                ", area= " + getArea() +
                '}');
    }
}

class Square extends Shape {
    public Square(float side) throws InvalidEntryException {
        if (side > 0) {
            this.side1 = side;
            this.side2 = side;
        } else {
            throw new InvalidEntryException();
        }
    }

    @Override
    public float getArea() {
        return side1 * side1;
    }

    @Override
    public void printData() {
        System.out.println("Square{" +
                "side= " + side1 +
                ", area= " + getArea() +
                '}');
    }
}

class Rectangle extends Shape {
    public Rectangle(float length, float width) throws InvalidEntryException {
        if (length > 0 && width > 0) {
            this.side1 = length;
            this.side2 = width;
        } else {
            throw new InvalidEntryException();
        }
    }

    @Override
    public float getArea() {
        return side1 * side2;
    }

    @Override
    public void printData() {
        System.out.println("Rectangle{" +
                "length= " + side1 +
                ", width= " + side2 +
                ", area= " + getArea() +
                '}');
    }
}

class InvalidEntryException extends Exception {
    public InvalidEntryException() {
        super();
    }
}