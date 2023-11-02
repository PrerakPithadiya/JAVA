import java.util.Scanner;
public class Is_Two_Digit_Number{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        if(isTwoDigit(num)){
            System.out.println("The given Number have '2' Digits!");
        } else{
            System.out.println("The given Number haven't '2' Digits!");
        }
    }
    public static boolean isTwoDigit(int n){
        return (9 < n && n < 100);
    }
}