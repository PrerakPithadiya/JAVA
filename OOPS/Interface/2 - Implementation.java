package OOPS.Interface;

interface Animal1 {
    void makeSound();
}

class Dog1 implements Animal1 {
    public void makeSound() {
        System.out.println("Dog makes Sound");
    }
}

class Implementation {
    public static void main(String[] args) {
        Animal1 obj = new Dog1();
        obj.makeSound();
    }
}