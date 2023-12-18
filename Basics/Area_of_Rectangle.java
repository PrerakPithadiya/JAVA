import java.util.Scanner;
public class Area_of_Rectangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Length : ");
        float l = sc.nextFloat();
        System.out.print("Enter the Breadth : ");
        float b = sc.nextFloat();
        System.out.format("\nThe Area of Rectangle is : %.2f\n", calculateArea(l, b));
    }
    public static float calculateArea(float l, float b){
        return l * b;
    }
}