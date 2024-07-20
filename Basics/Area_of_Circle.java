import java.util.Scanner;

public class Area_of_Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radios of Circle : ");
        float r = sc.nextFloat();
        System.out.println("The Area of Circle is : " + calculateArea(r));
        sc.close();
    }

    public static float calculateArea(float r) {
        float pI = 3.1415f, area = 0.0f;
        area = pI * r * r;
        return area;
    }
}