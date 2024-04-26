package OOPS.Interface;

interface Mercedes {
    void maxSpeed(int speed);
}

class LambdaExpression2 {
    public static void main(String[] args) {
        Mercedes obj = (int speed) -> System.out.println("MaxSpeed of Mercedes is: " + speed);
        obj.maxSpeed(230);
    }
}