// import java.util.Scanner;

// class Employee {
// String name;
// String id;
// String dept;

// public Employee() {
// name = "guest";
// }

// public void copyDept(Employee other) {
// dept = other.dept;
// }

// public void displayDetails(Employee employee) {
// System.out.println("name: " + employee.name);
// System.out.println("id: " + employee.id);
// System.out.println("dept: " + employee.dept);
// }
// }


// public class FClass {
// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);
// Employee employee = new Employee();
// }
// }



// public class FClass {
// void evenDisplay(String name) {
// for (int i = 0; i < name.length(); i += 2) {
// System.out.println(name.charAt(i));
// }
// }

// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);
// String name = scanner.next();
// new FClass().evenDisplay(name);
// }
// }

// import java.util.Scanner;

// class Rectangle {
// private int width;
// private int height;

// Rectangle(int width, int height) {
// this.width = width;
// this.height = height;
// }

// void setWidth(int width) {
// if (width > 0) {
// this.width = width;
// }
// }

// int getWidth() {
// return width;
// }

// void setHeight(int height) {
// this.height = height;
// }

// int area() {
// return width * height;
// }
// }


// public class FClass {
// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);

// // String num = "100";
// // int realNum = Integer.parseInt(num);
// // System.out.println(num + 100);

// int width = Integer.parseInt(scanner.next().substring(1));
// int height = Integer.parseInt(scanner.next().substring(1));
// // System.out.println(width + height);

// // int width = scanner.nextInt();
// // int height = scanner.nextInt();
// Rectangle rectangle = new Rectangle(width, height);
// rectangle.setWidth(5);
// // rectangle.setHeight(5);
// // rectangle.width = -50;

// System.out.println(rectangle.area());
// System.out.println(rectangle.getWidth());
// }
// }
