public class If {
  public static void main(String[] args) {
    int temp = 22;
    if (temp > 30) {
      System.out.println("It's too hot");
      System.out.println("Drink water");
    } else if (temp > 20 && temp <= 30)
      System.out.println("Beautiful day");
    else
      System.out.println("Cold day");
  }
}
