package src;

class A {
    public void show1() {
        System.out.println("show in A");
    }
}

class B extends A {
    public void show2() {
        System.out.println("show in B");
    }
}

public class UpcastingAndDowncasting {
    public static void main(String[] args) {
        // Upcasting
        A obj = new B();
        obj.show1();

        // Downcasting
        B b = (B)obj;
        b.show2();
    }
}
