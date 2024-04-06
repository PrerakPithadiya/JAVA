package OOPS.Encapsulation;


public class Super_Keyword {
    static class Parent {
        private String parentName;

        public Parent() {
            System.out.println("This is 0 Parameterized Constructor!!!");
        }

        public Parent(String name) {
            System.out.printf("Hello! %s, The Parent Class Constructor Called!!!\n", name);
        }

        public String getName() {
            return parentName;
        }
    }

    static class Child extends Parent {
        private String childName;

        public Child(String name) {
            super(name);
            childName = name;
        }

        public String getName() {
            return childName;
        }
    }

    public static void main(String[] args) {
        Child c = new Child("Prerak");
        System.out.println(c.getName());
    }
}