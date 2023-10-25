package src;
class Parent {
    public Parent() {
        System.out.println("in parent class constructor");
    }

    public Parent(int num) {
        System.out.println("in parent class constructor with num: " + num);
    }

    public Parent(String name) {
        System.out.println("in parent class constructor with name: " + name);
    }
}

class Child extends Parent {
    public Child() {
        System.out.println("in child class constructor");
    }

    public Child(int num) {
        super(num);
        System.out.println("in child class constructor with num: " + num);
    }

    public Child(String name) {
        // super(name);
        this();
        System.out.println("in child class constructor with name: " + name);
    }
}

public class SuperKeyDemo {
    public static void main(String[] args) {
        var child1 = new Child();
        var child2 = new Child(5);
        var child3 = new Child("Amit");
    }
}
