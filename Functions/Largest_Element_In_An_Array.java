import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Largest_Element_In_An_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of an Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        generateRandomArray(arr, n);
        System.out.println("The Array is : " + Arrays.toString(arr));
        int maxEle = maxElement(arr, n);
        System.out.println("The Maximum Element is an Array is : " + maxEle);
    }

    public static int maxElement(int[] arr, int n) {
        int max = Integer.MIN_VALUE;
        for (int element : arr) {
            max = Math.max(max, element);
        }
        return max;
    }

    public static void generateRandomArray(int[] arr, int n) {
        Random rd = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = rd.nextInt(10, 100);
        }
    }
}