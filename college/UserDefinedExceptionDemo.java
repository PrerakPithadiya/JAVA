
class DivideByZeroException extends Exception {

    DivideByZeroException(String s) {
        super(s);
    }
}

class UserDefinedExceptionDemo {

    public static void main(String[] args) {
        try {
            int a = 10, b = 0;
            if (b == 0) {
                throw new DivideByZeroException("Divide by zero");
            }
            int c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
