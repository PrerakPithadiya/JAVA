package OOPS.Encapsulation;

public class ConstructorExample {
    static class Student {
        private String name;
        private int age;

        // Parameterized Constructor
        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void display() {
            System.out.println("Name: " + name + ", Age: " + age);
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student("Alice", 20);
        Student student2 = new Student("Bob", 21);
        student1.display();
        student2.display();
    }
}
