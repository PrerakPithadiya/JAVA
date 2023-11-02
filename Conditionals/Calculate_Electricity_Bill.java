import java.util.Scanner;
public class Calculate_Electricity_Bill{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Unit Charges : ");
        float units = sc.nextFloat();
        float bill = calculateTotalBill(units);
        System.out.println("The Electricity Bill : Rupees" + bill);
    }
    public static float calculateTotalBill(float units){
        float bill = 0.0f;
        if(units <= 50){
            bill = units * 0.50f;
        } else if(units <= 150){
            bill = units * 0.75f;
        } else if(units <= 250){
            bill = units * 1.20f;
        } else{ 
            bill = units * 1.50f;
        }
        bill = bill * 0.20f;
        return bill;
    }
}