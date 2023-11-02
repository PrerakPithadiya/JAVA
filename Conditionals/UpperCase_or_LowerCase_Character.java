import java.util.Scanner;
public class UpperCase_or_LowerCase_Character{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the AlphaBet : ");
        char ch = sc.next().charAt(0);
        String result = "";
        if(upperOrLowerCase(ch)){
            result = "UpperCase!";
        } else{
            result = "LowerCase!";
        }
        System.out.println("The given AlphaBet is in " + result);
    }
    public static boolean upperOrLowerCase(char ch){
        if(ch >= 'A' && ch <= 'Z'){
            return true;
        } else{
            return false;
        }
    }
}