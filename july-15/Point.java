import java.util.*;

class Func {
  private int x, y;

  // implement the constructor and
  Func(int x, int y) {
    this.x = x;
    this.y = y;
  }

  // override the toString() and equals() methods
  @Override
  String toString(int x, int y) {
    return "(" + x + ',' + y + ")";
  }

  @Override
  Boolean equals(int x, int y) {
    if (x == y)
      return true;
    else
      return false;
  }
}


class Point {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x1 = sc.nextInt();
    int y1 = sc.nextInt();
    int x2 = sc.nextInt();
    int y2 = sc.nextInt();

    Func p1 = new Func(x1, y1);
    Func p2 = new Func(x2, y2);

    if (p1.equals(p2))
      System.out.println(p1 + "==" + p2);
    else
      System.out.println(p1 + "!=" + p2);
  }
}
