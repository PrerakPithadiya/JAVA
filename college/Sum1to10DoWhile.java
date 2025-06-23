
class Sum1to10DoWhile {

    public static void main(String[] args) {
        int i = 1, s = 0;
        do {
            s += i;
            i++;
        } while (i <= 10);
        System.out.println(s);
    }
}
