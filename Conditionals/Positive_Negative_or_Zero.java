import java.util.Scanner;
public class Positive_Negative_or_Zero{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        System.out.println("The given Number is : " + findNumberType(n));
    }
    public static String findNumberType(int n){
        String ans = "";
        if(n > 0){
            ans = "Positive";
        } else if(n < 0){
            ans = "Negative";
        } else{
            ans = "Zero";
        }
        return ans;
    }
}