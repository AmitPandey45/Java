package src;

import java.lang.FunctionalInterface;

@FunctionalInterface
interface IFunctionalInterface {
    void display();
    // void show();
}

class A implements IFunctionalInterface {
    @Override
    public void display() {
        System.out.println("in display()");
    }
}

@FunctionalInterface
interface ILambdaDemo1 {
    void show();
}

@FunctionalInterface
interface ILambdaDemo2 {
    void show(int i);
}

@FunctionalInterface
interface ILambdaDemo3 {
    void show(int i, String name);
}

@FunctionalInterface
interface ILambdaDemo4 {
    int add(int num1, int num2);
}

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        IFunctionalInterface obj = new A();
        obj.display();

        IFunctionalInterface obj1 = new IFunctionalInterface() {
            @Override
            public void display() {
                System.out.println("in display()");
            }
        };
        obj1.display();

        System.out.println("==== Lambda Demo with Functional Interface ====");
        ILambdaDemo1 lmd1 = () -> System.out.println("ILambdaDemo1 show()");
        lmd1.show();

        ILambdaDemo2 lmd2 = (i) -> System.out.println("ILambdaDemo2 show() " + i);
        lmd2.show(5);
        lmd2 = i -> System.out.println("ILambdaDemo2 show() " + i);
        lmd2.show(10);

        ILambdaDemo3 lmd3 = (i, name) -> System.out.println("ILambdaDemo3 show() => Name: " + name + "_" + i);
        lmd3.show(1, "Amit");

        ILambdaDemo4 lmd4 = (num1, num2) -> num1 + num2;
        System.out.println("Add: " + lmd4.add(3, 5));
    }
}
