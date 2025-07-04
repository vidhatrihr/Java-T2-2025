import java.util.Arrays;

public class Hello {
  public static void main(String[] args) {

    for (int i = 0; i < 10; i++) {
      System.out.printf("The value of i is %d \n", i);
      if (i == 5) {
        System.out.println("i in the middle");
        continue;
      }
      System.out.printf("end of iteration %d \n", i);
    }

    // int candy = 0;

    // do {
    // System.out.println("I am happy");
    // } while (candy > 0);

    // int i = 5;
    // while (i > 0) {
    // System.out.println(i);
    // i--;
    // }

    // String word = "apple";

    // switch (word) {
    // case "apple":
    // System.out.println("THis is a fruit");
    // break;
    // case "dog":
    // System.out.println("This is an animal");
    // break;
    // default:
    // System.out.println("Any word");
    // break;
    // }

    // String message = "Hello";

    // for (int i = message.length() - 1; i >= 0; i--) {
    // System.out.println(message.charAt(i));
    // }



    // for (int i = 1; i <= message.length(); i++) {
    // System.out.println(message.charAt(message.length() - i));
    // }

    // for (int i = 0; i < message.length(); i++) {
    // System.out.println(message.charAt(i));
    // }

    // for (char c : message.toCharArray()) {
    // System.out.println(c);
    // }

    // for (char c : letters) {
    // System.out.println(c);
    // }

    // for (int i = 0; i < letters.length; i++) {
    // System.out.printf("i = %d, letter = %s \n", i, letters[i]);
    // }

    // String[] fruits = {"apple", "banana", "mango"};
    // String name = "vidhatri";
    // System.out.println(name.toCharArray());
    // char[] charArray = {'a', 'p', 'l', 'e'};

    // for (int i = 0; i < charArray.length; i++) {
    // System.out.println(charArray[i]);
    // }

    // System.out.println(charArray);
    // System.out.println(Arrays.toString(charArray));

    // System.out.println(fruits.length);
    // System.out.println(name.length());

    // double pi = 3.14;
    // int pi_ = (int) pi;
    // System.out.println(pi_);

    // Student vidu = new Student("vidu", 21);
    // vidu.introduction();
    // System.out.println(fruits);
    // System.out.println(Arrays.toString(fruits));
    // System.out.println(Arrays.toString(args));
    // int k = Integer.parseInt(args[0]);
    // for (int i = 1; i <= k; i++) {
    // System.out.println("Hello");
    // }
    // final double pi;
    // pi = 3.14;
    // System.out.println(pi);


  }
}


class Student {
  String name;
  int age;

  Student(String name, int age) {
    this.name = name;
    this.age = age;
  }

  void introduction() {
    System.out.printf("My name is %s and I am %d years old \n", name, age);
  }
}

