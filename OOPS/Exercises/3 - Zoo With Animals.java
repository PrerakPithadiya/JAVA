package OOPS.Exercises;

class ZooWithAnimals {
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

        public Zoo(Animal[] animals) {
            this.animals = animals;
        }

        public void makeAllSounds() {
            for (Animal animal : animals) {
                animal.makeSound();
            }
        }
    }

    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat()};
        Zoo zoo = new Zoo(animals);
        zoo.makeAllSounds();
    }
}
