package OOPS.Exercises;

import java.util.Arrays;

// Class representing a Student
class Student {
    // Fields
    private int studentId;     // The ID of the student
    private String studentName; // The name of the student
    private final float[] grades;    // Array to store grades

    // Constructor
    public Student() {
        // Initialize the grades array with size 3
        this.grades = new float[3];
    }

    // Setter method for student ID
    public void setId(int id) {
        this.studentId = id;
    }

    // Getter method for student ID
    public int getId() {
        return this.studentId;
    }

    // Setter method for student name
    public void setName(String name) {
        this.studentName = name;
    }

    // Getter method for student name
    public String getName() {
        return this.studentName;
    }

    // Method to add grades
    public void addGrades(float marks1, float marks2, float marks3) {
        grades[0] = marks1;
        grades[1] = marks2;
        grades[2] = marks3;
    }

    // Method to get grades as a string
    public String getGrades() {
        return Arrays.toString(this.grades);
    }
}

class StudentGradeTracker {
    public static void main(String[] args) {
        // Create a new Student object
        Student student = new Student();

        // Set student details
        student.setId(1029);
        student.setName("Henry Roberts");
        student.addGrades(98.67f, 76.89f, 88.21f);

        // Print student details
        System.out.println("Student name: " + student.getName());
        System.out.println("Student ID: " + student.getId());
        System.out.println("Student grades: " + student.getGrades());
    }
}