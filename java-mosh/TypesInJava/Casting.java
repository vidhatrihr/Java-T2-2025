package TypesInJava;

import java.text.MessageFormat;

public class Casting {
  public static void main(String[] args) {
    // Implicit casting
    short x = 1;
    int y = x + 2;
    System.out.println(y);

    String num1 = "1";
    int num2 = Integer.parseInt(num1) + 100;
    String num3 = MessageFormat.format("Parse {1} int of num1 is {0}", num2, "rahul");
    System.out.println(num3);

    String decimal_String = "1.23";
    double parsed = Double.parseDouble(decimal_String) + 2;
    System.out.println(parsed);
  }
}
