import java.util.Random;
public class Absolute_Value{
    public static void main(String[] args){
        Random rd = new Random();
        int n = rd.nextInt(-1_00_000, 1_00_000);
        System.out.println("The Number is : " + n);
        System.out.println("The Absolute Value of '" + n + "' is : " + findAbsolute(n));
    }
    public static int findAbsolute(int n){
        return (n < 0) ? n * -1 : n;
    }
}