import java.util.Scanner;
public class Is_Three_Digit_Number{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        if(isThreeDigit(num)){
            System.out.println("The given Number have '3' Digits!");
        } else{
            System.out.println("The given Number haven't '3' Digit!");
        }
    }
    public static boolean isThreeDigit(int n){
        return (100 <= n && n <= 999);
    }
}