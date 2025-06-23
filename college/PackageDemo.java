package mypack;

public class PackageDemo {

    public void show() {
        System.out.println("Package Demo");
    }
}

class TestPackage {

    public static void main(String[] args) {
        mypack.PackageDemo p = new mypack.PackageDemo();
        p.show();
    }
}
