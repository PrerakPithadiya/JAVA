import java.util.Scanner;
public class Area_of_Triangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base : ");
        float base = sc.nextFloat();
        System.out.print("Enter Height : ");
        float height = sc.nextFloat();
        System.out.println("The Area of Triangle is : " + calculateArea(height, base));
    }
    public static float calculateArea(float h, float b){
        return (h * b) / 2;
    }
}
Substract_the Product_and_Sum_of_Digits_of_an_Integer