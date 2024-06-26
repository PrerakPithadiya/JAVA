package OOPS.Exercises;

class AnimalSoundDemo {
    static class Animal {
        protected String sound;

        public Animal() {
            this.sound = "Generic animal sound";
        }

        public void makeSound() {
            System.out.println(sound);
        }
    }

    static class Dog extends Animal {
        public Dog() {
            this.sound = "Woof";
        }
    }

    static class Cat extends Animal {
        public Cat() {
            this.sound = "Meow";
        }
    }

    static class Cow extends Animal {
        public Cow() {
            this.sound = "Moo";
        }
    }

    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        Animal animal3 = new Cow();

        animal1.makeSound();
        animal2.makeSound();
        animal3.makeSound();
    }
}
