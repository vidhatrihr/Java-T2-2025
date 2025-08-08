public class Comparison {
  public static void main(String[] args) {
    boolean hasHighIncome = true;
    boolean hasGoodCredit = true;
    boolean hasCriminalRecord = false;
    boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
    System.out.println(isEligible);

    int temperature = 40;
    boolean isWarm = temperature > 20 && temperature < 30;
    System.out.println(isWarm);
  }
}
