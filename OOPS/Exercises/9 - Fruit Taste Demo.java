package OOPS.Exercises;

class FruitTasteDemo {
    // Parent class
    static class Fruit {
        protected String name;

        public Fruit(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void taste() {
            System.out.println("The taste of " + name + " is undefined.");
        }
    }

    // Child class inheriting from Fruit
    static class Apple extends Fruit {
        private String variety;

        public Apple(String name, String variety) {
            super(name);
            this.variety = variety;
        }

        @Override
        public void taste() {
            System.out.println("The taste of " + name + " (" + variety + ") is sweet.");
        }
    }

    // Another child class inheriting from Fruit
    static class Orange extends Fruit {
        private String color;

        public Orange(String name, String color) {
            super(name);
            this.color = color;
        }

        @Override
        public void taste() {
            System.out.println("The taste of " + name + " (color: " + color + ") is tangy.");
        }
    }

    public static void main(String[] args) {
        Fruit fruit1 = new Apple("Apple", "Red Delicious");
        Fruit fruit2 = new Orange("Orange", "Orange");

        fruit1.taste();
        fruit2.taste();
    }
}
