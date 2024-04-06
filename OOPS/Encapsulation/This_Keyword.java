package OOPS.Encapsulation;


public class This_Keyword {
    static class Demo_Class {
        String name;
        int age;

        public Demo_Class() {
            this("Rohan", 23);
            System.out.println("This is 0 Parameterized Constructor!");
            name = "Ronit";
            age = 19;
        }

        public Demo_Class(String name) {
            this();
            this.name = name;
            age = 34;
        }

        public Demo_Class(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void display() {
            System.out.println(this.name);
            System.out.println(this.age);
        }
    }

    static class Student {
        String name;

        Student() {
            this("Prerak");
            this.name = "Mohil";
        }

        Student(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }
    }

    public static void main(String[] args) {
        Demo_Class dC = new Demo_Class();
        dC.display();

        Demo_Class dC2 = new Demo_Class("Rahul");
        dC2.display();

        Student s = new Student();
        System.out.println(s.getName());
    }
}
