
class Shape {

    float area(float radius) {
        return 3.14f * radius * radius;
    }

    float area(float length, float width) {
        return length * width;
    }

    public static void main(String[] args) {
        Shape s = new Shape();
        System.out.println(s.area(5f));
        System.out.println(s.area(4f, 6f));
    }
}
