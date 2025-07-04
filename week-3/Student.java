public class Student {
  String name;
  int age;
  int salary;

  Student(String name, int age, int salary) {
    this.name = name;
    this.age = age;
    this.salary = salary;
  }

  void showInfo() {
    System.out.printf("%s is %d years old, salary is %d", name, age, salary);
  }

  public static void main(String[] args) {
    Student vidu = new Student("vidu", 21, 10);
    vidu.showInfo();
  }
}
