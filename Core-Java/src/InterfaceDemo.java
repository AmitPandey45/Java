package src;

interface IComputer {
    int ram = 16; // final and static
    int screenSize = 16; // final and static
    String color = "Black"; // final and static
    void code();
}

abstract class Computer {
    abstract void code();
}

// class Laptop extends Computer {
//     public void code() {
//         System.out.println("write code, compile, and run");
//     }
// }

// class Desktop extends Computer {
//     public void code() {
//         System.out.println("write code, compile, and run => Fast");
//     }
// }

class Laptop implements IComputer {
    public void code() {
        System.out.println("write code, compile, and run");
    }
}

class Desktop implements IComputer {
    public void code() {
        System.out.println("write code, compile, and run => Fast");
    }
}

class Developer {
    public void developApp(IComputer computer) {
        computer.code();
    }
}

// class -> class => extends
// interface -> interface => extends
// class -> interface => implements

interface A {
    void show();
    void config();
}

interface B {
    void display();
}

interface C extends B {
    String getName();
}

class D implements A, B, C {

    @Override
    public String getName() {
        return "Amit Pandey";
    }

    @Override
    public void display() {
        System.out.println("in display()");
    }

    @Override
    public void show() {
        System.out.println("in show()");
    }

    @Override
    public void config() {
        System.out.println("in config()");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        // Computer laptop = new Laptop();
        // Computer desktop = new Desktop();

        IComputer laptop = new Laptop();
        IComputer desktop = new Desktop();

        var developer = new Developer();

        developer.developApp(desktop);
        developer.developApp(laptop);

        System.out.println("Ram: "+IComputer.ram);
        System.out.println("Screen Size: "+IComputer.screenSize);
        System.out.println("Color: "+IComputer.color);

        A ia = new D();
        ia.show();
        ia.config();
        
        B ib = new D();
        ib.display();

        C ic = new D();
        ic.display();
        System.out.println(ic.getName());
    }
}
