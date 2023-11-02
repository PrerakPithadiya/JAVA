import java.util.Scanner;
public class Find_Progress{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Percentage : ");
        int percentage = sc.nextInt();
        System.out.println("Your Progress is : \"" + calculateProgress(percentage) + "\"!");
    }
    public static String calculateProgress(int n){
        String ans = "";
        if(n > 90){
            ans = "Excellent";
        } else if(n > 80){
            ans = "Very Good";
        } else if(n > 70){
            ans = "Good";
        } else if(n > 60){
            ans = "Can Do Better";
        } else if(n > 50){
            ans = "Average";
        } else if(n > 40){
            ans = "Below Average";
        } else{
            ans = "Fail";
        }
        return ans;
    }
}