import java.util.Scanner;
public class Max_of_Two{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Value : ");
        int a = sc.nextInt();
        System.out.print("Enter Second Value : ");
        int b = sc.nextInt();
        int max = findMaxOfTwo(a, b);
        System.out.println("The Maximum Number is : " + max);
    }
    public static int findMaxOfTwo(int a, int b){
        return (a > b) ? a : b;
    }
}