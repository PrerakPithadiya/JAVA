package OOPS.Exercises;

class AnimalPolymorphismDemo {
    static class Animal {
        public void makeSound() {
            System.out.println("Animal is Barking!");
        }
    }

    static class Cat extends Animal {
        public void makeSound() {
            System.out.println("Cat is Barking!");
        }
    }

    public static void main(String[] args) {
        Animal obj1 = new Animal();
        obj1.makeSound();

        Cat obj2 = new Cat();
        obj2.makeSound();
    }
}