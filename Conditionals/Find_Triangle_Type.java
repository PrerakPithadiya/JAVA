import java.util.Scanner;
public class Find_Triangle_Type{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Side : ");
        int a = sc.nextInt();
        System.out.print("Enter the Second Side : ");
        int b = sc.nextInt();
        System.out.print("Enter the Third Side : ");
        int c = sc.nextInt();
        String result = findTriangleType(a, b, c);
        System.out.println("The given Triangle is '" + result + "'!");
    }
    public static String findTriangleType(int a, int b, int c){
        String ans = "";
        if(a == b && b == c && a == c){
            ans = "Equilateral";
        } else if(a == b || b == c || a == c){
            ans = "Isosceles";
        } else{
            ans = "Scalene";
        }
        return ans;
    }
}