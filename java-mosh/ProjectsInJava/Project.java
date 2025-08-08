package ProjectsInJava;

import java.util.Scanner;
import java.text.NumberFormat;

public class Project {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    if (scanner.hasNextLine()) {
      Integer Principal = scanner.nextInt();
      Double AIR = scanner.nextDouble();
      Integer Period = scanner.nextInt();

      Double MonthlyInterest = AIR / 1200;
      Integer Exponent = Period * 12;
      Double Base = 1 + MonthlyInterest;
      Double Power = Math.pow(Base, Exponent);
      Double Mortgage = Principal * ((MonthlyInterest * Power) / (Power - 1));
      String MortgageInCurrency = NumberFormat.getCurrencyInstance().format(Mortgage);

      System.out.println("Principal: " + Principal);
      System.out.println("Period: " + Period);
      System.out.println("Annual Interest Rate: " + AIR);
      System.out.println("Mortgage: " + MortgageInCurrency);
    }


  }

}
