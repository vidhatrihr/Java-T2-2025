public class Methods {

  public static void main(String[] args) {
    String message = greetUser("Paru");
    System.out.println(message);

  }

  public static String greetUser(String name) {
    return "Hello " + name;
  }
}
