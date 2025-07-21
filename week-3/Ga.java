class Example {
  private int x;
  private int y;

  public Example(int x, int z) {
    x = x;
    y = z;
  }

  public void print() {
    System.out.println("(" + x + ", " + y + ")");
  }
}


public class Ga {
  public static void main(String[] args) {
    Example p = new Example(10, 20);
    p.print();
  }
}

// public class Ga {
// public static void main(String[] args) {
// String str1, str2;
// str1 = "welcome to IITM";
// str2 = str1.substring( 0, 11) + "java course";
// System.out.println(str2);
// }
// }

