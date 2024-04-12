package OOPS.Encapsulation;

public class ConstructorUsage {
    static class Student {
        String name;
        int age;

        // Parameterized constructor
        Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Constructor using this()
        Student() {
            this("John Doe", 20); // Calls the parameterized constructor with default values
        }

        // Method to display student details
        void display() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }

    public static void main(String[] args) {
        // Creating objects using both constructors
        Student student1 = new Student("Alice", 25);
        Student student2 = new Student();

        // Displaying student details
        System.out.println("Student 1:");
        student1.display();

        System.out.println("\nStudent 2:");
        student2.display();
    }
}


// In this program:

// - The first constructor (Student(String name, int age)) is a parameterized constructor that initializes the name and age instance variables of a Student object.
// - The second constructor (Student()) is a default constructor that uses the this() keyword to call the parameterized constructor with default values ("John Doe" for name and 20 for age) if no arguments are provided.
// - Additionally, the Student class has a display() method that prints the name and age of a student.

// In the main method:

// - Two Student objects are created using both constructors.
// - The first student is initialized with specific values for name and age.
// - The second student is created using the default constructor, demonstrating the use of this() to invoke another constructor within the same class.
// - Finally, the details of both students are displayed using the display() method.
// - This program effectively demonstrates the usage of constructors in Java, including the invocation of one constructor from another using the this() keyword.