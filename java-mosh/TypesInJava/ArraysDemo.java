package TypesInJava;

import java.util.Arrays;

public class ArraysDemo {
  public static void main(String[] args) {
    int[] numbers = new int[5];
    System.out.println(Arrays.toString(numbers));
    numbers[0] = 5;
    numbers[1] = 10;
    numbers[2] = 15;
    System.out.println(Arrays.toString(numbers));

    int[] arr = {2, 3, 4, 5, 0, 6};
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));

    final float PI = 3.14F;
    System.out.println(PI);
  }
}
