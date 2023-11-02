import java.util.Scanner;
public class CalculateGrade{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Physics Marks : ");
        int a = sc.nextInt();
        System.out.print("Enter Chemistry Marks : ");
        int b = sc.nextInt();
        System.out.print("Enter Biology Marks : ");
        int c = sc.nextInt();
        System.out.print("Enter Maths Marks : ");
        int d = sc.nextInt();
        System.out.print("Enter Computer Marks : ");
        int e = sc.nextInt();
        int sum = calculateTotal(a, b, c, d, e);
        float avg = calculatePercentage(sum);
        char grade = findGrade(avg);
        System.out.println("Your Grade is : '" + grade + "'");
    }
    public static int calculateTotal(int a, int b, int c, int d, int e){
        return a + b + c + d + e;
    }
    public static float calculatePercentage(int sum){
        return sum / 5.0f;
    }
    public static char findGrade(float p){
        char grade = '0';
        if(p >= 90){
            grade = 'A';
        } else if(p >= 80){
            grade = 'B';
        } else if(p >= 70){
            grade = 'C';
        } else if(p >= 60){
            grade = 'D';
        } else if(p >= 40){
            grade = 'E';
        } else{
            grade = 'F';
        }
        return grade;
    }
}