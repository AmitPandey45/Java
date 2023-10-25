package src;

class A {
    public int marks;

    public void display() {
        System.out.println("display in A");
    }

    class B {
        public void config() {
            System.out.println("config in B");
        }
    }

    static class C {
        public void show() {
            System.out.println("show in C");
        }

        public static void staticShow() {
            System.out.println("staticShow in C");
        }
    }
}

public class InnerClassDemo {
    public static void main(String[] args) {
        var a = new A();
        System.out.println("a: " + a.marks);
        a.display();

        var b = a.new B();
        b.config();
        A.B b1 = a.new B();
        b1.config();
        A.B b2 = new A().new B();
        b2.config();
        // A.B b3 = new A.B();
        // b3.config();

        var c = new A.C();
        c.show();
        A.C c1 = new A.C();
        c1.show();
        // A.C c2 = a.new C();
        // c2.show();
        A.C.staticShow();
        c1.staticShow();
    }
}
