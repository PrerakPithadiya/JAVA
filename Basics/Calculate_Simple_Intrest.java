import java.util.Scanner;
public class Calculate_Simple_Intrest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Principal : ");
        float p = sc.nextFloat();
        System.out.print("Enter the Rate : ");
        float r = sc.nextFloat();
        System.out.print("Enter the Time : ");
        float t = sc.nextFloat();
        float sI = calculateSimpleIntrest(p, r, t);
        System.out.format("\nThe Simple Intrest is : %.2f\n", sI);
    }
    public static float calculateSimpleIntrest(float p, float r, float t){
        return (p * r * t) / 100;
    }
}