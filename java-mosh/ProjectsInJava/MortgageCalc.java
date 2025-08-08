package ProjectsInJava;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalc {
  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int principal = (int) readNumber(1000, 1000_000);
    float annualInterest = (float) readNumber(1, 30);
    byte years = (byte) readNumber(1, 30);

    String mortgage = calculateMortgage(principal, annualInterest, years);

    System.out.println("principal: " + principal);
    System.out.println("annualInterest: " + annualInterest);
    System.out.println("years: " + years);
    System.out.println("mortgage: " + mortgage);
  }

  public static double readNumber(int min, int max) {
    double number;

    while (true) {
      number = scanner.nextDouble();
      if (number >= min && number <= max)
        break;
      System.out.println(String.format("Enter a number between %d and %d", min, max));
    }
    return number;
  }

  public static String calculateMortgage(int principal, float annualInterest, byte years) {
    float monthlyInterest = annualInterest / 100 / 12;
    float r = monthlyInterest;

    short months = (short) (years * 12);
    short n = months;

    double mortgage = principal * r * Math.pow(1 + r, n) / (Math.pow(1 + r, n) - 1);
    NumberFormat format = NumberFormat.getCurrencyInstance();
    return format.format(mortgage);
  }
}
