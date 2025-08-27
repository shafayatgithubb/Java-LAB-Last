import java.util.Random;

class Shape {
    int length;
    int width;

    public Shape(int length, int width) {
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }

    double perimeter() {
        return 2 * (length + width);
    }
}

class Rectangle extends Shape {
    public Rectangle(int length, int width) {
        super(length, width);

    }

    double diagonalFunc() {
        return Math.sqrt((length * length) + (width * width));
    }
}

class Triangle extends Shape {
    public Triangle(int base, int height) {
        super(base, height);
    }

    double area() {
        return 0.5 * super.area();
    }

    double perimeter() {
        return 3 * super.length;
    }
}

class Shape3D extends Shape {
    int height;

    public Shape3D(int length, int width, int height) {
        super(length, width);
        this.height = height;
    }

    double volume() {
        return height * super.area();
    }

    double surfaceArea() {
        return 2 * ((length * width) + (length * height) + (height * width));
    }
}

class Sphere extends Shape3D {
    int radius;

    Sphere(int radius) {
        super(radius, radius, radius);

    }

    double volume() {
        return 1.25*Math.PI*Math.pow(radius,3);
    }

    double surfaceArea() {
        return 4*Math.PI*super.area();
    }
}

public class Shape2D {
    public static void main(String[] args) {
        Shape s1 = new Shape(10, 20);

        Rectangle r1 = new Rectangle(10, 20);

        Triangle t1 = new Triangle(10, 20);

        Shape3D shape1 = new Shape3D(10, 20, 30);

        Sphere sphere1 = new Sphere(10);

        System.out.println("Area" + s1.area());
        System.out.println("Area" + s1.perimeter());
        System.out.println("Area" + r1.diagonalFunc());
        System.out.println("Area: " + t1.area());
        System.out.println("Perimeter: " + t1.perimeter());
        System.out.println("Volume: " + shape1.volume());
        System.out.println("SurfaceArea: " + shape1.surfaceArea());
        System.out.println("Volume: " + sphere1.volume());
        System.out.println("SurfaceArea: " + sphere1.surfaceArea());
    }
}
