package TypesInJava;

import java.text.NumberFormat;
import java.util.Locale;

public class FormattedNumbers {
  public static void main(String[] args) {
    // NumberFormat percent = NumberFormat.getPercentInstance();

    NumberFormat currency = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
    String result = currency.format(1234567.891);
    // String result = percent.format(0.25);
    System.out.println(result);
  }
}
