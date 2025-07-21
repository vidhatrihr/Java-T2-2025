abstract class Vehicle {
  String brand;
  String color;

  Vehicle(String brand, String color) {
    this.brand = brand;
    this.color = color;
  }

  abstract void start();

  abstract void stop();

  void show() {
    System.out.println("Brand: " + brand);
    System.out.println("color: " + color);
  }
}


class Car extends Vehicle {
  Car(String brand, String color) {
    super(brand, color);
  }

  void start() {
    System.out.println("Car starts");
  }

  void stop() {
    System.out.println("Car stops");
  }

  void parkInside() {
    System.out.println("Car will park inside");
  }
}


abstract class Bike extends Vehicle {
  Bike(String brand, String color) {
    super(brand, color);
  }

  void start() {
    System.out.println("Bike starts");
  }

  void parkOutside() {
    System.out.println("Bike will Park outside");
  }

  // void stop() {
  // System.out.println("Bike stops");
  // }
}


class SportsBike extends Bike {
  SportsBike(String brand, String color) {
    super(brand, color);
  }

  void stop() {
    System.out.println("SportsBike stops");
  }

  void highSpeed() {
    System.out.println("SportsBike in highSpeed");
  }
}


public class Main {

  static void parking(Vehicle vehicle) {
    if (vehicle instanceof Bike) {
      ((Bike) vehicle).parkOutside();
    }
    if (vehicle instanceof Car) {
      ((Car) vehicle).parkInside();
    }
  }

  public static void main(String[] args) {
    Car myCar = new Car("xylo", "blue");
    Bike myBike = new SportsBike("yamaha", "blue");
    parking(myCar);
    parking(myBike);
    // myCar.start();
    // myBike.start();
    // myBike.stop();
    // if (myBike instanceof SportsBike) {
    // ((SportsBike) myBike).highSpeed();
    // }
  }
}

// abstract class Animal {
// void eat() {
// System.out.println("I am eating");
// }

// abstract void sleep();
// }


// interface Flyable {
// void fly();
// }


// interface Swimmable {
// void swim();
// }


// class Insect implements Flyable, Swimmable {
// public void fly() {
// System.out.println("Insect is flying");
// }

// public void swim() {
// System.out.println("Insect can swim");
// }
// }


// class Bird extends Animal {
// void sleep() {
// System.out.println("I am getting sleepy now");
// }
// }


// class Human extends Animal {
// void sleep() {
// System.out.println("Human is getting sleepy now");
// }
// }


// public class Main {

// public static void main(String[] args) {
// Bird parrot = new Bird();
// Human vidu = new Human();

// parrot.eat();
// vidu.eat();
// vidu.sleep();
// }
// }
