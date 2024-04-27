package OOPS.Exercises;

class RectangleAreaCalculator {
    static class Shape {
        public float getArea() {
            return 0.0f;
        }
    }

    static class Rectangle {
        float length;
        float breadth;

        Rectangle(float length, float breadth) {
            this.length = length;
            this.breadth = breadth;
        }

        public float getArea() {
            return this.length * this.breadth;
        }
    }

    public static void main(String[] args) {
        float length = 12.45f;
        float breadth = 56.78f;

        Rectangle rec = new Rectangle(length, breadth);
        System.out.println("The Area of Rectangle is : " + rec.getArea());
    }
}
