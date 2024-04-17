package OOPS.Interface;

interface Animal {
    String name = "Dog";

    void makeSound();
}

class Basics {
    public static void main(String[] args) {
        System.out.println("The name of Animal is: " + Animal.name);

        // this line will give an compileTime error
        // Animal obj = new Animal();
    }
}