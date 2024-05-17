package OOPS.Exercises;

// Entry point of the program
class AreaCalculator {
    public static void main(String[] args) {
        // Create a Rectangle object with specific dimensions
        Shape shape = new Rectangle(23.45, 78.92);

        // Print the area of the rectangle
        System.out.println("Rectangle area: " + shape.calculateArea());
    }
}

// Interface representing a shape
interface Shape {
    // Method to calculate the area of the shape
    double calculateArea();
}

// Class representing a rectangle, implementing the Shape interface
class Rectangle implements Shape {
    // Instance variables for length and breadth of the rectangle
    private double length;
    private double breadth;

    // Constructor to initialize length and breadth
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate the area of the rectangle
    @Override
    public double calculateArea() {
        return length * breadth;
    }
}