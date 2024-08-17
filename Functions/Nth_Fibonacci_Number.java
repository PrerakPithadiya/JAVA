import java.util.Scanner;

public class Main {
    static final int MOD = 1000000007;

    // Function to multiply two matrices
    static void multiply(long[][] A, long[][] B) {
        long a = (A[0][0] * B[0][0] + A[0][1] * B[1][0]) % MOD;
        long b = (A[0][0] * B[0][1] + A[0][1] * B[1][1]) % MOD;
        long c = (A[1][0] * B[0][0] + A[1][1] * B[1][0]) % MOD;
        long d = (A[1][0] * B[0][1] + A[1][1] * B[1][1]) % MOD;

        A[0][0] = a;
        A[0][1] = b;
        A[1][0] = c;
        A[1][1] = d;
    }

    // Function to perform matrix exponentiation
    static void power(long[][] M, int n) {
        if (n == 0 || n == 1)
            return;

        // Matrix representing Fibonacci relation
        long[][] F = {{1, 1}, {1, 0}};

        power(M, n / 2);
        multiply(M, M);

        if (n % 2 != 0)
            multiply(M, F);
    }

    // Function to find the nth Fibonacci number using matrix exponentiation
    static long fib(int n) {
        if (n == 1 || n == 2)
            return 1;

        long[][] M = {{1, 1}, {1, 0}};
        power(M, n - 1);

        return M[0][0];  // F(n) is in M[0][0] after exponentiation
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            System.out.println(fib(N));
        }

        sc.close();
    }
}
