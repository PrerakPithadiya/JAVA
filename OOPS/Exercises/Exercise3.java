package OOPS.Exercises;

class Animal {
    protected String sound;

    public Animal() {
        this.sound = "Animal sound";
    }

    public void makeSound() {
        System.out.println(sound);
    }
}

class Dog extends Animal {
    public Dog() {
        this.sound = "Woof";
    }
}

class Cat extends Animal {
    public Cat() {
        this.sound = "Meow";
    }
}

class Zoo {
    private Animal[] animals;

    public Zoo(Animal[] animals) {
        this.animals = animals;
    }

    public void makeAllSounds() {
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}

public class Exercise3 {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat()};
        Zoo zoo = new Zoo(animals);
        zoo.makeAllSounds();
    }
}
