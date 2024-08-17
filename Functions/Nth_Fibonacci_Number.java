import java.util.*;
import java.io.*; 

public class Solution {
    static final int MOD = 1000000007;

    // Function to multiply two 2x2 matrices A and B
    private static void multiply(long[][] A, long[][] B) {
        long a = (A[0][0] * B[0][0] + A[0][1] * B[1][0]) % MOD;
        long b = (A[0][0] * B[0][1] + A[0][1] * B[1][1]) % MOD;
        long c = (A[1][0] * B[0][0] + A[1][1] * B[1][0]) % MOD;
        long d = (A[1][0] * B[0][1] + A[1][1] * B[1][1]) % MOD;

        A[0][0] = a;
        A[0][1] = b;
        A[1][0] = c;
        A[1][1] = d;
    }

    // Function to raise matrix M to the power of n
    private static void power(long[][] M, int n) {
        if (n == 0 || n == 1)
            return;

        long[][] F = {{1, 1}, {1, 0}};  // Fibonacci base matrix

        // Recursively exponentiate
        power(M, n / 2);
        multiply(M, M);

        // If n is odd, multiply one more time by the base matrix
        if (n % 2 != 0)
            multiply(M, F);
    }

    // Function to return the nth Fibonacci number
    public static int fibonacciNumber(int n) {
        // Base cases for F(1) = F(2) = 1
        if (n == 1 || n == 2)
            return 1;

        // Initial matrix
        long[][] M = {{1, 1}, {1, 0}};

        // Perform matrix exponentiation to calculate M^(n-1)
        power(M, n - 1);

        // The top-left element of the matrix holds F(n)
        return (int) M[0][0];
    }
}
