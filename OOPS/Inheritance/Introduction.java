package OOPS.Inheritance;

public class Introduction {
    static class Parent {
        String name;
        int age;

        void getInfo() {
            System.out.println("Name : " + this.name);
            System.out.println("Age : " + this.age);
        }
    }

    static class Child extends Parent {
        Child(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public static void main(String[] args) {
        Child obj = new Child("Prerak", 17);
        obj.getInfo();
    }
}
