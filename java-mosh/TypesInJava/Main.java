package TypesInJava;

import java.util.Date;

public class Main {
  public static void main(String[] args) {
    int age = 30;
    System.out.println(age);
    Date now = new Date();
    now.getTime();
    System.out.println(now);
    System.out.println("Hello World");
    String messageString = "String Hello World";
    System.out.println(messageString);
    System.out.println(messageString.replace("S", "*"));
    System.out.println(messageString.indexOf("g"));
    System.out.println(messageString.endsWith("ld"));
    System.out.println("Hello this is to escape\" where \" is used for quotation\"");
  }
}
