
class FactorialOf5 {

    public static void main(String[] args) {
        int f = 1;
        for (int i = 1; i <= 5; i++) {
            f *= i;
        }
        System.out.println(f);
    }
}
