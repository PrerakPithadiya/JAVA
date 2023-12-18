import java.util.Scanner;
public class Area_of_Parallelogram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Base : ");
        float base = sc.nextFloat();
        System.out.print("Enter the Height : ");
        float height = sc.nextFloat();
        float area = calculateArea(base, height);
        System.out.format("\nThe Area of Parallelogram is : %.2f\n", area);
    }
    public static float calculateArea(float b, float h){
        return b * h;
    }
}