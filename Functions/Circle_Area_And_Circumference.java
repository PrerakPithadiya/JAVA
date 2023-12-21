package Functions;

import java.util.Scanner;

public class Circle_Area_And_Circumference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radios of Circle : ");
        float r = sc.nextFloat();
        float area = calculateArea(r);
        float cir = calculateCircumference(r);
        System.out.printf("The Area of Circle is : %.2f\n", area);
        System.out.printf("The Circumference of Circle is : %.2f\n", cir);
    }

    public static float calculateArea(float r) {
        return 3.1415f * r * r;
    }

    public static float calculateCircumference(float r) {
        return 2 * 3.1415f * r;
    }
}