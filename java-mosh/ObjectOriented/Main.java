package ObjectOriented;

public class Main {
  public static void main(String[] args) {
    var Encapsulation = new Encapsulation(50_000, 20);
    int wage = Encapsulation.calculateWage(10);
    System.out.println(wage);

    var coupling = new Coupling();
    coupling.navigate("127.0.0");

    // var testBox1 = new TextBox();
    // System.out.println(testBox1.text.toUpperCase());
  }
}
