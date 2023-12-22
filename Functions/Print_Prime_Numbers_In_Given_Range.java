package Functions;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Print_Prime_Numbers_In_Given_Range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Starting Range : ");
        int start = sc.nextInt();
        System.out.print("Enter the Ending Range : ");
        int end = sc.nextInt();
        System.out.println("Prime Numbers from " + start + " to " + end + " are : ");
        System.out.println(printPrimes(start, end));
    }

    public static List<Integer> printPrimes(int start, int end) {
        List<Integer> primes = new ArrayList<>();
        for (int n = start; n <= end; n++) {
            if (isPrime(n)) {
                primes.add(n);
            }
        }
        return primes;
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        if (n == 2 || n == 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
