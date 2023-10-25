package src;

abstract class Car {
    public abstract void drive();

    abstract void driveFast();

    abstract void backDrive();

    public void playMusic() {
        System.out.println("playing music...");
    }
}

abstract class WagonR extends Car {

    @Override
    public void drive() {
        System.out.println("driving...");
    }

    @Override
    public void driveFast() {
        System.out.println("driving fast...");
    }
}

class UpdatedWagonR extends WagonR {
    @Override
    public void backDrive() {
        System.out.println("back driving...");
    }

    public void navigation() {
        System.out.println("providing navigation...");
    }
}

public class AbstractKeyDemo {
    public static void main(String[] args) {
        var car = new UpdatedWagonR();
        car.drive();
        car.driveFast();
        car.backDrive();
        car.playMusic();
        car.navigation();

        Car car1 = new UpdatedWagonR();
        car1.drive();
        car1.driveFast();
        car1.backDrive();
        car1.playMusic();
        // car1.navigation();
    }
}
