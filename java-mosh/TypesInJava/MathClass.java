package TypesInJava;

public class MathClass {
  public static void main(String[] args) {
    // int result = Math.round(1.1F);
    // int result = (int) Math.ceil(1.1F);
    // int result = (int) Math.floor(1.1F);
    // int result = Math.max(1, 4);
    // double result = Math.random() * 100;
    int result = (int) Math.round(Math.random() * 100);
    System.out.println(result);
    System.out.println(Math.ceil(3.9));
    System.out.println(Math.floor(3.9));
    System.out.println(Math.round(3.0));
  }
}
