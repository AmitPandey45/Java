package src;

class A {
    public void show() {
        System.out.println("show in A");
    }
}

abstract class B {
    abstract void show();

    abstract void config();
}

public class AnanymousInnerClass {
    public static void main(String[] args) {
        var a = new A() {
            public void show() {
                System.out.println("new show");
            }
        };
        a.show();

        B b = new B() {

            @Override
            void show() {
                System.out.println("in show");
            }

            void config() {
                System.out.println("in config");
            }
        };

        b.show();
        b.config();
    }
}
