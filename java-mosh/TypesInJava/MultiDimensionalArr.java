package TypesInJava;

import java.util.Arrays;

public class MultiDimensionalArr {
  public static void main(String[] args) {
    int[][] two_D = new int[3][3];
    two_D[0][0] = 1;
    System.out.println(Arrays.deepToString(two_D));

    int[][][] three_D = new int[1][1][1];
    three_D[0][0][0] = 1;
    System.out.println(Arrays.deepToString(three_D));

    int[][] two_d = {{1, 2, 3}, {4, 5, 6}};
    System.out.println(Arrays.deepToString(two_d));

  }
}
