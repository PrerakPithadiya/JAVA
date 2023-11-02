import java.util.Scanner;
public class Is_AlphaBet{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Character : ");
        char ch = sc.next().charAt(0);
        String result = "";
        if(isAlphaBet(ch)){
            result = "is";
        } else{
            result = "isn't";
        }
        System.out.println("The given Character " + result + " a AlphaBet!");
    }
    public static boolean isAlphaBet(char ch){
        return ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'));
    }
}