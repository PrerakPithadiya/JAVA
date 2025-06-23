
abstract class Shape2 {

    abstract float area();
}

class Triangle extends Shape2 {

    float b, h;

    Triangle(float b, float h) {
        this.b = b;
        this.h = h;
    }

    float area() {
        return 0.5f * b * h;
    }
}

class Rectangle2 extends Shape2 {

    float l, w;

    Rectangle2(float l, float w) {
        this.l = l;
        this.w = w;
    }

    float area() {
        return l * w;
    }
}

class Circle2 extends Shape2 {

    float r;

    Circle2(float r) {
        this.r = r;
    }

    float area() {
        return 3.14f * r * r;
    }
}

class ShapeDemo {

    public static void main(String[] args) {
        Triangle t = new Triangle(3, 4);
        Rectangle2 r = new Rectangle2(5, 6);
        Circle2 c = new Circle2(2);
        System.out.println(t.area());
        System.out.println(r.area());
        System.out.println(c.area());
    }
}
