package src;

enum Status {
  Running,
  Failed,
  Pending,
  Success,
}

enum LaptopEnum {
  Mackbook(2000),
  XPS(1200),
  Surface,
  Thinkpad(1600);

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  private int price;

  private LaptopEnum() {
    this.price = 500;
    System.out.println("In default constructor: " + this.name());
  }

  private LaptopEnum(int price) {
    this.price = price;
    System.out.println("In parameterized constructor: " + this.name());
  }
}

public class EnumDemo {
  public static void main(String[] args) {
    Status[] allStatuses = Status.values();
    Status s1 = Status.valueOf("Pending");
    System.out.println("Status by string value: " + s1);
    System.out.println("===== =====");
    for (Status status : allStatuses) {
      System.out.println("ordinal: " + status.ordinal());
      System.out.println("status: " + status);
      System.out.println("status: " + status.toString());
    }

    System.out.println("===== =====");
    Status s = Status.Pending;
    if (s == Status.Running) {
      System.out.println("All Good");
    } else if (s == Status.Pending) {
      System.out.println("Please wait...");
    } else if (s == Status.Failed) {
      System.out.println("Try again");
    } else {
      System.out.println("Done");
    }

    Status s2 = Status.Failed;
    switch (s2) {
      case Running -> System.out.println("All Good");
      case Pending -> System.out.println("Please wait...");
      case Failed -> System.out.println("Please try again...");
      default -> System.out.println("Done");
    }

    System.out.println("==== ====");

    var mackbook = LaptopEnum.Mackbook;
    System.out.println("mackbook.toString(): " + mackbook.toString());
    System.out.println("mackbook: " + mackbook);
    System.out.println("mackbook.ordinal(): " + mackbook.ordinal());
    System.out.println("mackbook.name(): " + mackbook.name());
    System.out.println("mackbook.getPrice(): " + mackbook.getPrice());

    System.out.println("==== Final data ====");
    for (LaptopEnum lap : LaptopEnum.values()) {
      System.out.println("Laptop: " + lap + " price: " + lap.getPrice());
    }
  }
}
