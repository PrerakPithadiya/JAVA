package OOPS.Exercises;

class ZooSimulation {
    static class Animal {
        protected String sound;

        public Animal() {
            this.sound = "Animal sound";
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

    static class Zoo {
        private Animal[] animals;

        public Zoo() {
            animals = new Animal[3];
            animals[0] = new Dog();
            animals[1] = new Cat();
            animals[2] = new Animal();
        }

        public void makeSounds() {
            for (Animal animal : animals) {
                animal.makeSound();
            }
        }
    }

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.makeSounds();
    }
}
