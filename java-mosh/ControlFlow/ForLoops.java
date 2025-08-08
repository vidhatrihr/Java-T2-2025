public class ForLoops {
  public static void main(String[] args) {
    for (int i = 0; i < 5; i++)
      System.out.println("Hello Vidu " + i);

    String[] fruits = {"Apple", "Mango", "Orange", "Banana"};
    for (String fruit : fruits) // enhanced for loop
      System.out.println(fruit);

    // can decrement 👇
    for (int i = fruits.length; i > 0; i--)
      System.out.println(fruits[i - 1] + (i - 1));
  }
}
