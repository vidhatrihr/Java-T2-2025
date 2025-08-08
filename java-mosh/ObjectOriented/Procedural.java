package ObjectOriented;

public class Procedural {
  public static void main(String[] args) {
    var Encapsulation = new Encapsulation(50_000, 5);

    int baseSalary = 50_000;
    int extraHours = 10;
    int hourlyRate = 20;

    int wage = calculateWage(baseSalary, extraHours, hourlyRate);
    System.out.println(wage);
  }

  public static int calculateWage(int baseSalary, int extraHours, int hourlyRate) {
    return baseSalary + (extraHours * hourlyRate);
  }

}
