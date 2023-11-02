import java.util.Scanner;
public class Is_Valid_Triangle_Sides{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Side : ");
        int a = sc.nextInt();
        System.out.print("Enter the Second Side : ");
        int b = sc.nextInt();
        System.out.print("Enter the Third Side : ");
        int c = sc.nextInt();
        String result = "";
        if(isValidSides(a, b, c)){
            result = "are";
        } else{
            result = "aren't";
        }
        System.out.println("The given Trinagle's Sides " + result + " Valid!");
    }
    public static boolean isValidSides(int a, int b, int c){
        boolean con1 = a + b > c;
        boolean con2 = b + c > a;
        boolean con3 = a + c > b;
        return con1 && con2 && con3;
    }
}