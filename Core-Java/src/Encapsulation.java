package src;
class Human {
    private String name;
    private int age;

    public Human() {
        this.name = "John";
        this.age = 12;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + " Age: " + this.age;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        var human1 = new Human();
        human1.setName("Amit Pandey");
        human1.setAge(34);
        System.out.println(human1.toString());
 
        var human2 = new Human();
        System.out.println(human2.toString());
        
        var human3 = new Human("Anit Pandey", 30);
        System.out.println(human3.toString());
    }
}
