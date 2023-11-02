import java.util.Scanner;
public class Is_Divisible_by_3_or_5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        if(isDivisible(n)){
            System.out.println("The given Number is either Divisible by '3' or '5'");
        } else{
            System.out.println("The given Number is neither Divisible by '3' nor '5'");
        }
    }
    public static boolean isDivisible(int n){
        return (n % 5 == 0 || n % 3 == 0);
    }
}