package OOPS.Encapsulation;

public class EncapsulationExample {
    static class Circle {
        private double radius;
        private double area;

        public double getArea() {
            return this.area;
        }

        public void setRadius(double radius) {
            if (radius > 0) this.radius = radius;
            else System.out.println("Radius should be greater than 0.");
        }

        public void calculateArea() {
            this.area = Math.PI * radius * radius;
        }
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(5); // Set radius
        circle.calculateArea();
        System.out.println("Area of the circle: " + circle.getArea());
    }
}
