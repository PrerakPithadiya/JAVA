import java.util.Scanner;
public class Is_Leap_Year{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Year : ");
        int year = sc.nextInt();
        String result = "";
        if(isLeap(year)){
            result = "is";
        } else{
            result = "isn't";
        }
        System.out.println("The given Year " + result + " Leap!");
    }
    public static boolean isLeap(int year){
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}