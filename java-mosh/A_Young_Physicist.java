import java.util.Scanner;

public class A_Young_Physicist {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int T = scanner.nextInt();

    int iSum = 0;
    int jSum = 0;
    int kSum = 0;

    while (T > 0) {
      int i = scanner.nextInt();
      int j = scanner.nextInt();
      int k = scanner.nextInt();

      iSum += i;
      jSum += j;
      kSum += k;
      // System.out.printf("%d %d %d\n", i, j, k);
      T--;
    }

    if (iSum == 0 && jSum == 0 && kSum == 0)
      System.out.println("YES");
    else
      System.out.println("NO");
  }
}
