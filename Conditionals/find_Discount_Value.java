import java.util.Scanner;
public class find_Discount_Value{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Quantity : ");
        int quantity = sc.nextInt();
        System.out.print("Enter the Price per Item : ");
        float price = sc.nextFloat();
        float bill = quantity * price;
        if(quantity > 100){
            bill = bill - (bill * 0.10f);
        }
        System.out.println("The Payable Amount is : " + bill);
    }
}