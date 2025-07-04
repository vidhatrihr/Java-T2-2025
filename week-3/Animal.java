public class Animal {
  String name;
  String color;

  Animal() {
    name = "something";
    color = "orange";
  }

  Animal(String name, String color) {
    this.name = name;
    this.color = color;
  }

  void printInfo() {
    System.out.println(String.format("name: %s, color: %s", name, color));
  }

  void eat() {
    System.out.println("Animal is eating whatever");
  }

  void eat(String food) {
    System.out.println(String.format("Animal is eating %s", food));
  }

  void eat(int drink) {
    System.out.println(String.format("Animal is eating %s", drink));
  }

  void eat(int a, int b) {
    System.out.println("Animal is eating " + (a + b));
  }


  public static void main(String[] args) {
    Animal dog = new Animal();
    dog.printInfo();
    dog.eat();
    dog.eat("candy");
    dog.eat(20, 50);
    dog.eat(9);

    Animal cat = new Animal("cat", "white");
    cat.printInfo();
  }
}

// public class Animal {
// String name;
// String color;

// Animal(String name, String color) {
// this.name = name;
// this.color = color;
// }

// void eat() {
// System.out.printf("%s eats food", name);
// }

// public static void main(String[] args) {
// Animal dog = new Animal("monty", "black");
// dog.eat();
// }
// }


