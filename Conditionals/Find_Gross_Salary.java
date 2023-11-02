import java.util.Scanner;
public class Find_Gross_Salary{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Basic Salary : ");
        float basicSalary = sc.nextFloat();
        float grossSalary = calculateGrossSalary(basicSalary);
        System.out.format("The Gross Salary is : %.2f", grossSalary);
    }
    public static float calculateGrossSalary(float salary){
        float HRA = 0, DA = 0;
        if(salary >= 10000){
            HRA = salary * 0.20f;
            DA = salary * 0.80f;
        } else if(salary <= 20000){
            HRA = salary * 0.25f;
            DA = salary * 0.90f;
        } else{
            HRA = salary * 0.30f;
            DA = salary * 0.95f;
        }
        float grossSalary = salary + HRA + DA;
        return grossSalary;
    }
}