
class ThisKeywordDemo {

    int x;

    ThisKeywordDemo(int x) {
        this.x = x;
    }

    void show() {
        System.out.println(x);
    }

    public static void main(String[] args) {
        ThisKeywordDemo t = new ThisKeywordDemo(10);
        t.show();
    }
}
