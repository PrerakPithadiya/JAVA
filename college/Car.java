
class Car {

    int topSpeed;
    String name;

    Car(int topSpeed, String name) {
        this.topSpeed = topSpeed;
        this.name = name;
    }

    public String toString() {
        return name + " " + topSpeed;
    }

    public static void main(String[] args) {
        Car c1 = new Car(200, "A");
        Car c2 = new Car(180, "B");
        Car c3 = new Car(220, "C");
        Car c4 = new Car(210, "D");
        Car c5 = new Car(190, "E");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
    }
}
