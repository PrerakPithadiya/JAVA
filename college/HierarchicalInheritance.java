
class D {

    int a = 1;
}

class E extends D {

    int b = 2;
}

class F extends D {

    int c = 3;
}

class HierarchicalInheritance {

    public static void main(String[] args) {
        E e = new E();
        F f = new F();
        System.out.println(e.a + " " + e.b);
        System.out.println(f.a + " " + f.c);
    }
}
