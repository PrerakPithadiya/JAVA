import java.util.Scanner;
public class Divisible_With_Five{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        String result = "";
        if(isDivisible(n)){
            result = "is";
        } else{
            result = "isn't";
        }
        System.out.println("Result : The given number " + result + " divisible with '5'.");
    }
    public static boolean isDivisible(int n){
        return (n % 5 == 0) ? true : false;
    }
}