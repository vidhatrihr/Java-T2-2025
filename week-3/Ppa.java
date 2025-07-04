import java.util.*;

// class Employee {
// String eid;
// String ename;
// String eprojects[];

// public void mutator() {
// this.ename = "Mr " + this.ename;
// this.eprojects[0] = null;
// }

// // /

// }


// public class FClass {
// public static void main(String[] args) {
// Scanner s = new Scanner(System.in);
// String project[] = {"P001", "P002", "P003"};
// // Enter the id of employee
// String id = s.nextLine();
// // Enter the name of employee
// String name = s.nextLine();

// Employee e1 = new Employee(id, name, project);
// Employee e2 = new Employee(e1);
// // The copy constructor must copy all the data members.

// e1.mutator();

// e2.display();
// }
// }

// class Employee {
// String ename;
// String eid;
// String edept;

// public Employee() {
// ename = "guest";
// }

// public Employee(String name, String id, String dept) {
// this.ename = name;
// this.eid = id;
// this.edept = dept;
// }

// public void copyDept(Employee employee) {
// this.edept = employee.edept;
// }

// public void displayDetails() {
// System.out.println("ename " + ename);
// System.out.println("eid " + eid);
// System.out.println("edept " + edept);
// }
// }


// public class Ppa {
// public static void main(String args[]) {
// Scanner s = new Scanner(System.in);
// Employee e1 = new Employee();

// // Enter name of the employee
// String name = s.nextLine();

// // Enter id of the employee
// String id = s.nextLine();

// // Enter department of the employee
// String dept = s.nextLine();

// Employee e2 = new Employee(name, id, dept);

// e1.copyDept(e2);
// // Copies the department name of e2 into e1's department name.

// e1.displayDetails();
// }
// }



// public class Ppa {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int sum = 0;
// for (int i = 0; i <= n; i++) {
// sum += Math.pow((n - (n - i)), 2);
// }

// System.out.println(sum);
// }
// }


// class Ppa {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// String s1 = sc.next();
// evenDisplay(s1);
// }

// // Define evenDisplay(String) method here
// public static void evenDisplay(String s) {
// String word = "";
// for (int i = 0; i < s.length(); i++) {
// if (i % 2 == 0) {
// word += s.charAt(i);
// }
// }
// System.out.println(word);
// }
// }



// class Rectangle {
// int w; // width
// int h; // height
// // LINE-1: write the function setw(int) to initialize w

// public void setw(int width) {
// w = width;
// }

// // LINE-2: write the function seth(int) to initialize h
// public void seth(int height) {
// h = height;
// }

// // LINE-3: write the function area() to return area of rectangle
// public int area() {
// return w * h;
// }
// }


// public class Ppa1W2 {
// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);
// int w = Integer.parseInt(scanner.nextLine());
// int h = Integer.parseInt(scanner.nextLine());
// Rectangle r = new Rectangle();
// r.setw(w);
// r.seth(h);
// int area = r.area();
// System.out.print(area);
// }
// }
