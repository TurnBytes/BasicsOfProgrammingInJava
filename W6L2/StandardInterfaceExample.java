// StandardInterfaceExample.java
// This file provides a standard example of interfaces in Java.
// Interfaces define a contract that implementing classes must follow.
// They enable multiple inheritance and complete abstraction.

interface Drawable {
    // Abstract method - must be implemented by implementing classes
    void draw();

    // Default method (Java 8+) - optional implementation
    default void erase() {
        System.out.println("Erasing the shape.");
    }

    // Static method (Java 8+) - utility method
    static void printInfo() {
        System.out.println("This is a drawable object.");
    }
}

interface Resizable {
    // Abstract method
    void resize(double factor);
}

class Circle implements Drawable, Resizable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius " + radius);
    }

    @Override
    public void resize(double factor) {
        radius *= factor;
        System.out.println("Circle resized. New radius: " + radius);
    }

    // Circle-specific method
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Drawable, Resizable {
    private double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle with width " + width + " and height " + height);
    }

    @Override
    public void resize(double factor) {
        width *= factor;
        height *= factor;
        System.out.println("Rectangle resized. New dimensions: " + width + " x " + height);
    }

    // Rectangle-specific method
    public double getArea() {
        return width * height;
    }
}

public class StandardInterfaceExample {
    public static void main(String[] args) {
        // Create instances
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        // Use interface methods
        System.out.println("Drawing shapes:");
        circle.draw();
        rectangle.draw();

        System.out.println("\nResizing shapes:");
        circle.resize(2.0);
        rectangle.resize(1.5);

        System.out.println("\nUsing default method:");
        circle.erase();
        rectangle.erase();

        System.out.println("\nUsing static method:");
        Drawable.printInfo();

        System.out.println("\nCalculating areas:");
        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Rectangle area: " + rectangle.getArea());

        // Polymorphism with interfaces
        System.out.println("\nPolymorphism:");
        Drawable[] shapes = {circle, rectangle};
        for (Drawable shape : shapes) {
            shape.draw();
        }
    }
}