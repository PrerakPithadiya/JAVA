import java.util.Scanner;
public class OddEven{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        String result = "";
        if(isOdd(n)){
            result = "Odd";
        } else{
            result = "Even";
        }
        System.out.println("The given Number is : " + result);
    }
    public static boolean isOdd(int n){
        return (n & 1) == 1;
    }
}