import java.util.Scanner;
public class Max_of_Three{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Value  : ");
        int a = sc.nextInt();
        System.out.print("Enter Second Value : ");
        int b = sc.nextInt();
        System.out.print("Enter Third Value  : ");
        int c = sc.nextInt();
        int max = findMaxOfThree(a, b, c);
        System.out.println("The Maximum Number is : " + max);
    }
    public static int findMaxOfThree(int a, int b, int c){
        return Math.max(Math.max(a, b), c);
    }
}