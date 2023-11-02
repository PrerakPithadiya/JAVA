import java.util.Scanner;
public class Is_Area_Greater_Than_Perimeter{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Length : ");
        float length = sc.nextFloat();
        System.out.print("Enter the Breadth : ");
        float breadth = sc.nextFloat();
        if(isGreaterThan(length, breadth).equals("area")){
            System.out.println("Rectangle's Area is Greater Than It's Perimeter!");
        } else if(isGreaterThan(length, breadth).equals("perimeter")){
            System.out.println("Rectangle's Perimeter is Greater Than It's Area!");
        } else{
            System.out.println("Rectangle's Area & It's Perimeter are Equal!");
        }
    }
    public static String isGreaterThan(float l, float b){
        float area = l * b;
        float perimeter = 2 * (l + b);
        System.out.printf("Area : %.2f\nPerimeter : %.2f\n", area, perimeter);
        String ans = "";
        if(area > perimeter){
            ans = "area";
        } else if(area < perimeter){
            ans = "perimeter";
        } else{
            ans = "same";
        }
        return ans;
    }
}