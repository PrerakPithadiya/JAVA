import java.util.Scanner;
public class Is_Bonus_Get{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Joined Year : ");
        int joinedYear = sc.nextInt();
        System.out.print("Enter the Current Year : ");
        int currYear = sc.nextInt();
        String result = "get";
        if(!isBonusGet(currYear - joinedYear)){
            result = "can't get";
        }
        System.out.println("The Employee " + result + " Bonus of Rs. 2500!");
    }   
    public static boolean isBonusGet(int years){
        return years > 3;
    }
}