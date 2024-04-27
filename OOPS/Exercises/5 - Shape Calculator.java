package OOPS.Exercises;

class Shape {
    protected double area;

    public Shape() {
        this.area = 0.0;
    }

    public double getArea() {
        return area;
    }

    public void calculateArea() {
        System.out.println("Calculating area for a generic shape...");
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void calculateArea() {
        area = length * width;
        System.out.println("Calculating area for a rectangle...");
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        area = Math.PI * radius * radius;
        System.out.println("Calculating area for a circle...");
    }
}

class ShapeCalculator {
    public static void main(String[] args) {
        Shape shape1 = new Rectangle(5, 4);
        Shape shape2 = new Circle(3);

        System.out.println(shape1.getArea());
        System.out.println(shape2.getArea());
        shape1.calculateArea();
        shape2.calculateArea();
    }
}