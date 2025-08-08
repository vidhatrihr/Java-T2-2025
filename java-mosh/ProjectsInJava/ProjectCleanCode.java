package ProjectsInJava;

import java.util.Scanner;

public class ProjectCleanCode {
  static Scanner scanner = new Scanner(System.in);

  final static byte monthsInYear = 12;
  final static byte percent = 100;

  public static void main(String[] args) {
    int principal = (int) Console.readNumber(1000, 1000_000);
    float annualInterest = (float) Console.readNumber(1, 30);
    byte years = (byte) Console.readNumber(1, 30);

    var calculator = new MortgageCalculator(principal, annualInterest, years);
    var report = new MortgageReport(calculator);

    report.printMortgage(principal, annualInterest, years);
    report.printPaymentMethod(years, null);
  }
}


