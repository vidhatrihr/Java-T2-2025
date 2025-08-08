package TypesInJava;

import java.util.Scanner;

public class ReadingInput {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    if (scanner.hasNextByte()) {
      byte age = scanner.nextByte();
      System.out.println("You are " + age);
    } else {
      System.out.println("No valid input provided");
    }
  }
}
