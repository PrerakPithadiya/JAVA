
class LessThanZeroException extends Exception {

    LessThanZeroException(String s) {
        super(s);
    }
}

class LessThanZeroDemo {

    public static void main(String[] args) {
        try {
            int n = -1;
            if (n < 0) {
                throw new LessThanZeroException("Less than zero");
            }
            System.out.println(n);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
