import java.util.Scanner;

public class WhileLoop {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String input = "";

    while (true) {
      input = scanner.nextLine().toLowerCase();
      if (input.equals("pass"))
        continue;
      if (input.equals("quit"))
        break;
      System.out.println(input);
    }

    // while (!input.equals("quit")) {
    // input = scanner.next().toLowerCase();
    // System.out.println(input);
    // }

    // do {
    // input = scanner.next().toLowerCase();
    // System.out.println(input);
    // } while (!input.equals("quit"));
  }
}
