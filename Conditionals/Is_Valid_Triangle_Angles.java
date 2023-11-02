import java.util.Scanner;
public class Is_Valid_Triangle_Angles{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Angle : ");
        int a = sc.nextInt();
        System.out.print("Enter the Second Angle : ");
        int b = sc.nextInt();
        System.out.print("Enter the Third Angle : ");
        int c = sc.nextInt();
        String result = "";
        if(isValid(a, b, c)){
            result = "is";
        } else{
            result = "isn't";
        }
        System.out.println("The given Triangle " + result + " Valid!");
    }
    public static boolean isValid(int a, int b, int c){
        return (a + b + c) == 180;
    }
}