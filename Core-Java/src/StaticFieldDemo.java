package src;
class Animal {
    String specifies;
    String color;
    String Category;
    int legs;

    static String Data = "Some Animal related data";

    static {
        Data = "Data changed";
        System.out.println("In static block");
    }

    public Animal() {
        System.out.println("In constructor");
    }
}

class Mobile {
    String brand;
    double price;
    String name;
    static String Type;

    @Override
    public String toString() {
        return "Brand: " + this.brand + " Price: " + this.price + " Name: " + this.name + " Type: " + Type;
    }

    public void display() {
        System.out.println(this.brand + " " + this.price + " " + this.name);
    }

    public static void display1() {
        System.out.println("Calling static method => display1");
    }

    public static void display2(Mobile mobile) {
        System.out.println("Calling static method => display2");
        System.out.println(mobile.brand + " " + mobile.price + " " + mobile.name);
    }
}

public class StaticFieldDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        var mobile1 = new Mobile();
        mobile1.brand = "Apple";
        mobile1.name = "IPhone 15+";
        mobile1.price = 1500;

        var mobile2 = new Mobile();
        mobile2.brand = "Samsung";
        mobile2.name = "Samsung Galaxy 10";
        mobile2.price = 300;

        var mobile3 = new Mobile();
        mobile3.brand = "Realme";
        mobile3.name = "Realme X7 5G";
        mobile3.price = 300;

        Mobile.Type = "SmartPhone";
        // mobile1.Type = "Phone";

        mobile1.display();
        System.out.println(mobile1.toString());

        mobile2.display();
        System.out.println(mobile2.toString());

        mobile3.display();
        System.out.println(mobile3.toString());

        mobile1.display1();
        Mobile.display1();

        Mobile.display2(mobile1);

        // var animal1 = new Animal();
        // var animal2 = new Animal();
        // System.out.println(Animal.Data);
        Class.forName("Animal");
    }
}