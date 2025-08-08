package ProjectsInJava;

import java.text.NumberFormat;

public class MortgageReport {

  private MortgageCalculator calculator;

  public MortgageReport(MortgageCalculator calculator) {
    this.calculator = calculator;
  }

  public String printMortgage(int principal, double annualInterest, int years) {
    double mortgage = calculator.calculateMortgage();

    String mortgageInCurrency = NumberFormat.getCurrencyInstance().format(mortgage);

    System.out.println("Principal: " + principal);
    System.out.println("Period: " + years);
    System.out.println("Annual Interest Rate: " + annualInterest);
    return mortgageInCurrency;
  }

  public void printPaymentMethod(int years, String mortgageInCurrency) {
    System.out.println();
    System.out.println("MORTGAGE");
    System.out.println("-----------");
    System.out.println("Mortgage Payments: " + mortgageInCurrency);
    System.out.println();
    System.out.println("PAYMENT SCHEDULE");
    System.out.println("------------");
    for (short month = 1; month <= years * ProjectCleanCode.monthsInYear; month++) {
      double balance = calculator.calculateBalance(month);
      System.out.println(NumberFormat.getCurrencyInstance().format(balance));
    }
  }

}
