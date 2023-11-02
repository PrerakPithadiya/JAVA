import java.util.Scanner;
public class Is_Divisible_by_3_and_5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        if(isDivisibleByBoth(n)){
            System.out.println("The Number is Divisible by '3' & '5'");
        } else{
            System.out.println("The Number isn't Divisible by '3' && '5'");
        }
    }
    public static boolean isDivisibleByBoth(int n){
        return (n % 3 == 0 && n % 5 == 0);
    }
}