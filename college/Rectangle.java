
class Rectangle {

    int height;
    int width;

    Rectangle(int h, int w) {
        height = h;
        width = w;
    }

    int area() {
        return height * width;
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 10);
        System.out.println(r.area());
    }
}
