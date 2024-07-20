import java.util.Scanner;

/**
 * A program to calculate the area of a circle.
 */
public class AreaOfCircle {
    /**
     * The main method that prompts the user to enter the radius of a circle and
     * prints the calculated area.
     * 
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius of Circle: ");
        float r = sc.nextFloat();
        System.out.println("The Area of Circle is: " + calculateArea(r));
        sc.close();
    }

    /**
     * Calculates the area of a circle given its radius.
     * 
     * @param r the radius of the circle
     * @return the area of the circle
     * 
     * Example: calculateArea(5.0f) returns approximately 78.53982
     */
    public static float calculateArea(float r) {
        return (float) (Math.PI * r * r);
    }
}