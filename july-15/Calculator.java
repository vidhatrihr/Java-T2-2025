class Operations {
  void sum(double a, double b) {
    System.out.println(a + b);
  }

  void subtract(double a, double b) {
    System.out.println(a - b);
  }

  void multiply(double a, double b) {
    System.out.println(a * b);
  }

  void divide(double a, double b) {
    if (b != 0) {
      System.out.println(a / b);
    } else {
      System.out.println("Error: Division by zero");
    }
  }
}


public class Calculator extends Operations {
  void remainder(double a, double b) {
    if (b != 0) {
      System.out.println(a % b);
    } else {
      System.out.println("Error: Division by zero");
    }
  }

  public static void main(String[] args) {
    Calculator cal = new Calculator();
    cal.sum(10, 20);
    cal.subtract(10, 20);
    cal.multiply(10, 20);
    cal.divide(10, 20);
  }
}

