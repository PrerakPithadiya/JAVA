package OOPS.Interface;

class A {
    public void show() {
        System.out.println("It's Show method");
    }

    static class B {
        public void display() {
            System.out.println("It's Display method");
        }
    }
}

class InnerClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        A.B obj2 = new A.B();
        obj2.display();
    }
}
