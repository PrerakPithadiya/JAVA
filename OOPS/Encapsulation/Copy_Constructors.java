package OOPS.Encapsulation;

public class Copy_Constructors {
    static class Student1 {
        private String name;
        int roll;
        private String password;

        Student1(Student1 s1) {
            this.name = s1.name;
            this.roll = s1.roll;
            this.password = s1.password;
        }

        Student1(String name, int roll, String password) {
            this.name = name;
            this.roll = roll;
            this.password = password;
        }

        void getInfo() {
            System.out.printf("Name : %s\n", this.name);
            System.out.printf("Roll : %d\n", this.roll);
            System.out.printf("Password : %s\n", this.password);
        }

        void changeInfo(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Student1 s1 = new Student1("Prerak", 12, "@prerak");

        System.out.println("This is for Student1 1 : ");
        s1.getInfo();

        Student1 s2 = new Student1(s1);

        System.out.println("\nThis is for Student1 2 : ");
        s2.getInfo();
        System.out.println();

        s1.changeInfo("Mohil");

        s1.getInfo();
        s2.getInfo();
    }
}

