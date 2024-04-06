package OOPS.Encapsulation;

import java.util.Scanner;

public class Constructors {
    static class Student {
        private String name;
        private int age;

        Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return this.name;
        }

        public int getAge() {
            return this.age;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Name and Age : ");
        Student obj = new Student(sc.nextLine(), sc.nextInt());
        System.out.println("Name : " + obj.getName());
        System.out.println("Age : " + obj.getAge());
    }
}