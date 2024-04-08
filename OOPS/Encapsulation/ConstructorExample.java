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


// Explanation of the given code

// 1. The code defines a package `OOPS.Encapsulation`.

// 2. Inside this package, there's a class named `ConstructorExample`.

// 3. Inside `ConstructorExample`, there's a nested static class named `Student`.

// 4. The `Student` class has two private member variables: `name` (of type `String`) and `age` (of type `int`), representing the name and age of a student, respectively. Encapsulation is used here because these variables are declared as private, meaning they can only be accessed within the `Student` class itself.

// 5. The `Student` class has a parameterized constructor that takes two parameters: `name` and `age`. This constructor initializes the `name` and `age` instance variables with the values passed as arguments. It uses the `this` keyword to distinguish between the instance variables and the constructor parameters when they have the same name.

// 6. The `Student` class also has a method named `display()`, which prints the name and age of the student to the console.

// 7. In the `main` method:

//    - Two `Student` objects (`student1` and `student2`) are created using the parameterized constructor by passing the name and age of each student as arguments.
   
//    - The `display()` method is called on each `Student` object to print their respective information.

// 8. When the `main` method is executed:

//    - `student1` is created with the name "Alice" and age 20.
   
//    - `student2` is created with the name "Bob" and age 21.
   
//    - The `display()` method is called for both `student1` and `student2`, which prints their respective names and ages.

// In summary, the code demonstrates the use of encapsulation to hide the internal state of the `Student` class by making its member variables private, and it shows how to initialize those variables using a parameterized constructor. Additionally, it showcases the concept of creating objects and calling methods on those objects in Java.
