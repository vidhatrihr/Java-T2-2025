package ProjectsInJava;

public class Console {
  public static double readNumber(int min, int max) {
    double number;

    while (true) {
      number = ProjectCleanCode.scanner.nextDouble();
      if (number >= min && number <= max)
        break;
      System.out.println(String.format("Enter a number between %d and %d", min, max));
    }
    return number;
  }

}
