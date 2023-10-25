package src;

class Laptop {
    String brand;
    String model;
    double price;

    public String toString() {
        return "Brand: " + this.brand + " Model: " + this.model + " Price: " + this.price;
    }

    public boolean equals(Laptop other) {
        return this.brand.equals(other.brand) &&
                this.model.equals(other.model) &&
                this.price == other.price;
    }
}

public class ObjectClassMethod {
    public static void main(String[] args) {
        var laptop1 = new Laptop();
        laptop1.brand = "Apple";
        laptop1.model = "M1 Pro";
        laptop1.price = 2700;
        System.out.println(laptop1.toString());

        var laptop2 = new Laptop();
        laptop2.brand = "Apple";
        laptop2.model = "M2 Pro";
        laptop2.price = 2800;
        System.out.println(laptop2.toString());

        var laptop3 = new Laptop();
        laptop3.brand = "Apple";
        laptop3.model = "M1 Pro";
        laptop3.price = 2700;
        System.out.println(laptop3.toString());

        System.out.println("laptop1 == laptop3: " + laptop1.equals(laptop3));
    }
}
