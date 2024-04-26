package OOPS.Interface;

interface Deer {
    void makeSound();
}

class LambdaExpression1 {
    public static void main(String[] args) {
        Deer obj = () -> System.out.println("Deer makes Sound!");
        obj.makeSound();
    }
}