interface Connectable {
  void connectToWifi();
}


class Phone implements Connectable {
  public void connectToWifi() {
    System.out.println("Phone connected to wifi");
  }
}


class Laptop implements Connectable {
  public void connectToWifi() {
    System.out.println("Laptop connected to wifi");
  }
}


public class Demo {
  public static void main(String[] args) {
    Phone myPhone = new Phone();
    Laptop myLaptop = new Laptop();
    myPhone.connectToWifi();
    myLaptop.connectToWifi();
  }
}
