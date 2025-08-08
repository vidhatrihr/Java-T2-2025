package ProjectsInJava;

public class MortgageCalculator {
  private int principal;
  private float annualInterest;
  private int years;

  public MortgageCalculator(int principal, float annualInterest, int years) {
    this.principal = principal;
    this.annualInterest = annualInterest;
    this.years = years;
  }

  public double calculateMortgage() {
    double monthlyInterest =
        annualInterest / (ProjectCleanCode.monthsInYear * ProjectCleanCode.percent);
    int numberOfPayments = years * ProjectCleanCode.monthsInYear;

    double base = 1 + monthlyInterest;
    double power = Math.pow(base, numberOfPayments);
    double mortgage = principal * ((monthlyInterest * power) / (power - 1));
    return mortgage;
  }

  public double calculateBalance(short numberOfPaymentsMade) {
    double monthlyInterest =
        annualInterest / (ProjectCleanCode.monthsInYear * ProjectCleanCode.percent);
    int numberOfPayments = years * ProjectCleanCode.monthsInYear;

    double balance = principal
        * (Math.pow(1 + monthlyInterest, numberOfPayments)
            - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
        / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
    return balance;
  }

}
