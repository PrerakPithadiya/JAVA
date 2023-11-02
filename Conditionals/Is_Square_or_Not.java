import java.util.Scanner;
public class Is_Square_or_Not{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Length : ");
        float length = sc.nextFloat();
        System.out.print("Enter the Breadth : ");
        float breadth = sc.nextFloat();
        if(isSquare(length, breadth)){
            System.out.println("This is a Square!");
        } else{
            System.out.println("This isn't a Square!");
        }
    }
    public static boolean isSquare(float l, float b){
        return l == b;
    }
}