package OOPS.Inheritance;

public class Hierarchical {
    static class Animal {
        String name;

        void display() {
            System.out.println("This is Hierarchical Inheritance!");
            System.out.println("The Animal Class is Parent Class of All the Class!");
        }
    }

    static class Tiger extends Animal {

    }

    static class Monkey extends Animal {

    }

    static class Deer extends Animal {

    }

    public static void main(String[] args) {
        Animal a = new Animal();
        a.name = "Animal";
        System.out.println("Class Name is : " + a.name);
        a.display();

        Tiger t = new Tiger();
        t.name = "Tiger";
        System.out.println("Class Name is : " + t.name);
        t.display();

        Monkey m = new Monkey();
        m.name = "Monkey";
        System.out.println("Class Name is : " + m.name);
        m.display();

        Deer d = new Deer();
        d.name = "Deer";
        System.out.println("Class Name is : " + d.name);
        d.display();
    }
}