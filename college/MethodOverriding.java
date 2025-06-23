
class G {

    void show() {
        System.out.println("Parent");
    }
}

class MethodOverriding extends G {

    void show() {
        System.out.println("Child");
    }

    public static void main(String[] args) {
        MethodOverriding m = new MethodOverriding();
        m.show();
    }
}
