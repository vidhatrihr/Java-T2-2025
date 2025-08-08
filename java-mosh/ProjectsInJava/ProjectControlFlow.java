package ProjectsInJava;

import java.util.Scanner;
import java.text.NumberFormat;

public class ProjectControlFlow {
  public static void main(String[] args) {
    int Principal = 0;
    Double AIR = 0.0;
    int Period = 0;
    Scanner scanner = new Scanner(System.in);

    if (scanner.hasNextLine()) {
      while (true) {
        Principal = scanner.nextInt();
        if (Principal > 1_000 && Principal < 1_000_000)
          break;
        System.out.println("Enter a number between 1,000 and 1,000,000");

      }
      while (true) {
        AIR = scanner.nextDouble();
        if (AIR > 0 && AIR <= 30)
          break;
        System.out.println("Enter a number between 0 and 30");
      }

      while (true) {
        Period = scanner.nextInt();
        if (Period > 0 && Period <= 30)
          break;
        System.out.println("Enter a value greater than 0 or equal to 30");
      }

      Double MonthlyInterest = AIR / 1200;
      int Exponent = Period * 12;
      Double Base = 1 + MonthlyInterest;
      Double Power = Math.pow(Base, Exponent);
      Double Mortgage = Principal * ((MonthlyInterest * Power) / (Power - 1));
      String MortgageInCurrency = NumberFormat.getCurrencyInstance().format(Mortgage);

      System.out.println("Principal: " + Principal);
      System.out.println("Period: " + Period);
      System.out.println("Annual Interest Rate: " + AIR);
      System.out.println("Mortgage: " + MortgageInCurrency);

      // if (Principal > 1_000 && Principal < 1_000_000)
      // System.out.println("Principal: " + Principal);
      // else
      // System.out.println("Enter a number between 1,000 and 1,000,000");
      // if (Period > 0 && Period <= 30)
      // System.out.println("Period: " + Period);
      // else
      // System.out.println("Enter a value greater than 0 or equal to 30");

      // if (AIR > 0 && AIR <= 30)
      // System.out.println("Annual Interest Rate: " + AIR);
      // else
      // System.out.println("Enter a number between 0 and 30");

      // System.out.println("Mortgage: " + MortgageInCurrency);
    }

  }


}


