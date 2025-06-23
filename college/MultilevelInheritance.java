
class B {

    int y = 10;
}

class C extends B {

    int z = 20;
}

class MultilevelInheritance extends C {

    public static void main(String[] args) {
        MultilevelInheritance m = new MultilevelInheritance();
        System.out.println(m.y);
        System.out.println(m.z);
    }
}
