import java.util.Scanner;
public class Is_Vowel{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the AlphaBet : ");
        char ch = sc.next().charAt(0);
        String result = "";
        if(isVowel(ch)){
            result = "Vowel!";
        } else{
            result = "Consonant!";
        }
        System.out.println("The given Character is " + result);
    }
    public static boolean isVowel(char c){
        return (c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u') || (c == 'A') || (c == 'E') || (c == 'I') || (c == 'O') || (c == 'U');
    }
}