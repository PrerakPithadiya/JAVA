import java.util.Scanner;
public class Odd_Even{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        String result = oddEven(num);
        System.out.println("The given number is : " + result);
    }
    public static String oddEven(int n){
        String ans = "";
        if(n % 2 == 0){
            ans = "Even";
        } else{
            ans = "Odd";
        }
        return ans;
    }
}