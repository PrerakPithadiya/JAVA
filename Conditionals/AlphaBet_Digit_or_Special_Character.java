import java.util.Scanner;
public class AlphaBet_Digit_or_Special_Character{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Character : ");
        char ch = sc.next().charAt(0);
        System.out.println("The given Character is a " + findCharacterType(ch));
    }
    public static String findCharacterType(char ch){
        String result = "";
        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
            result = "AlphaBet!";
        } else if(ch >= '0' && ch <= '9'){
            result = "Digit!";
        } else{
            result = "Special Character!";
        }
        return result;
    }
}