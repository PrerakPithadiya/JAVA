
interface A1 {

    void showA();
}

interface B1 {

    void showB();
}

class MultipleInheritance implements A1, B1 {

    public void showA() {
        System.out.println("A");
    }

    public void showB() {
        System.out.println("B");
    }

    public static void main(String[] args) {
        MultipleInheritance m = new MultipleInheritance();
        m.showA();
        m.showB();
    }
}
