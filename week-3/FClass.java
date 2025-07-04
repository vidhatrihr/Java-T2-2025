class Numbers {
     public int x = 1;
     public double y = 2.1;

     public Numbers(int a, double b) {
          add(a, a);
          add(b, a);
     }

     public void add(int a, int b) {
          this.x = a + b;
     }

     public void add(double c, int d) {
          this.y = c + d;
     }
}


public class FClass {
     public static void main(String args[]) {
          Numbers obj = new Numbers(2, 3.2);
          System.out.println(obj.x + " " + obj.y);
     }
}


// class Mammal {
// public String name;
// public int lifespan;

// public Mammal(int age) {
// name = "Giraffe";
// lifespan = 45;
// System.out.println("Check if runs");
// }

// public void show() {
// System.out.println("Giraffe");
// System.out.format("name = %s : lifespan = %d", name, lifespan);
// }
// }


// class Endangered extends Mammal {
// public boolean endanger_status;

// public Endangered() {
// super(5);
// endanger_status = false;
// }

// public void show() {
// System.out.println("endanger status of " + this.name + " is " + endanger_status);
// }

// public void display() {
// this.show();
// }
// }


// public class FClass {
// public static void main(String args[]) {
// Endangered m1 = new Endangered();
// m1.show();
// m1.display();
// }
// }

// import java.util.Scanner;

// public class ScannerDemo {
// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);

// }
// }

// class A {
// public float g;

// public A() {
// g = 9.8f;
// }

// public void show() {
// System.out.println("g = " + g);
// }
// }


// class B extends A {
// public double e;

// public B(double num) {
// e = num;
// }

// public void show() {
// System.out.println("e = " + e);
// }
// }


// public class FClass {
// public static void main(String args[]) {
// A obj1 = new B(2.718);

// A ptr1 = (A) obj1;
// A ptr2 = (B) obj1;
// B ptr3 = (B) obj1;

// ptr1.show();
// ptr2.show();
// ptr3.show();
// }
// }
