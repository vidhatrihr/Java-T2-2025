interface A {
}


class B {
}


public class Aq extends B implements A {
  public static void main(String[] args) {
    System.out.println("extend and implement can happen together.");
  }
}

// interface A{
// int a=10;
// }
// interface B{
// int b=20;
// }
// class C implements A,B{
// }
// public class Aq{
// public static void main(String[] args){
// C oc=new C();
// oc.a=5;
// System.out.println(oc.a);
// oc.b=15;
// System.out.println(oc.b);
// }
// }

// interface A {
// int a = 30;
// }


// interface B {
// int b = 20;
// }


// class C implements B {
// }


// public class Aq {
// public static void main(String[] args) {
// C oc = new C();
// System.out.println(oc.b);
// }
// }
