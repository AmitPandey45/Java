package src;

// final with class => to prevent extend feature
// final with method => to prevent method to override
// final with variable => to prevent value of variable to change i.e. make variable to const

class A {
    final int data = 5;

    public void changeValue() {
        // cann't change
        // data = 10;        
    }
}

class B {
    public final void display() {    
        System.out.println("display() method in B");
    }

    final public void display1() {    
        System.out.println("display1() method in B");
    }

    public void display2() {    
        System.out.println("display2() method in B");
    }
}

final class C extends B {   
    // Cann't override final methods

    // public final void display() {    
    //     System.out.println("display() method in C");
    // }

    // final public void display1() {    
    //     System.out.println("display1() method in C");
    // }

    public void display2() {    
        System.out.println("display2() method in C");
    }
}

// Cann't extends final class C
// class D extends C {

// }

public class FinalKeyWord {
    public static void main(String[] args) {
        System.out.println("==== A class object ====");
        var a = new A();
        System.out.println("data: "+a.data);

        System.out.println("==== B class object ====");
        var b = new B();
        b.display();
        b.display1();
        b.display2();

        System.out.println("==== C class object ====");
        var c = new C();
        c.display();
        c.display1();
        c.display2();
    }
}