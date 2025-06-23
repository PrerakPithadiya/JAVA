
class ConstructorOverloading {

    int x;

    ConstructorOverloading() {
        x = 0;
    }

    ConstructorOverloading(int a) {
        x = a;
    }

    public static void main(String[] args) {
        ConstructorOverloading c1 = new ConstructorOverloading();
        ConstructorOverloading c2 = new ConstructorOverloading(5);
        System.out.println(c1.x);
        System.out.println(c2.x);
    }
}
