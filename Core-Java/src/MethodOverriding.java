package src;

class A {
    void display() {
        System.out.println("display() in A");
    }
}

class B extends A {
    @Override
    void display() {
        System.out.println("display() in B");
    }

    public String toString() {
        System.out.println("toString() method of class B");
        return "toString() method of class B";
    }
}

class C extends B {
    void display() {
        System.out.println("display() in C");
    }

    @Override
    public String toString() {
        System.out.println("toString() method of class C");
        return "toString() method of class C";
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        var a = new A();
        a.display();

        a = new B();
        a.display();
        a.toString();

        a = new C();
        a.display();
        a.toString();
    }
}
