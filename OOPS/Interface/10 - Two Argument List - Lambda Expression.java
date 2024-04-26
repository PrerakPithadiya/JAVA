package OOPS.Interface;

interface Sum {
    int add(int a, int b);
}

class LambdaExpression3 {
    public static void main(String[] args) {
        Sum obj = (a, b) -> a + b;

        int result = obj.add(5, 3);
        System.out.println("Result: " + result);
    }
}