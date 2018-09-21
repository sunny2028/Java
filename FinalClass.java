public class FinalClass {

  final int VAR_1;
  final int VAR_2 = 2;
  final StringBuilder str = new StringBuilder("StringBuilder");
  FinalClass() {

    VAR_1 = 0;
    str.append("newwwwwww");
  }

  FinalClass(int a) {

    VAR_1 = a;
  }

  void method() {

    str.append("another");
    StringBuilder s1 = new StringBuilder("New String Builder... ");
    str = s1;
  } 

  public static void main(String[] args) {

    FinalClass f = new FinalClass();
    System.out.println(f.VAR_1 +  " " + f.VAR_2);
    f.method();
  }
}
