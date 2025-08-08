public class Main {

  // Polymorphism

  public static void main(String[] args) {
    UIControl[] controls = {new TextBox(), new CheckBox()};
    for (var control : controls) {
      control.render();
    }
  }

  // Comparing Objects

  // public static void main(String[] args) {
  // var point1 = new Point(1, 2);
  // var point2 = new Point(1, 2);
  // System.out.println(point1.hashCode());
  // System.out.println(point2.hashCode());
  // }


  // Up casting and Down casting

  // public static void main(String[] args) {
  // var control = new UIControl(true);
  // var textBox = new TextBox();
  // show(textBox);
  // }

  // public static void show(UIControl control) {
  // if (control instanceof TextBox) {
  // var textBox = (TextBox) control;
  // textBox.setText("Hello World");
  // }
  // System.out.println(control);
  // }
}
