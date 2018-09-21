public class SwapObjects {

  int num1, num2;

/*  void swap(SwapObjects a, SwapObjects b) {

    a.num1 = a.num1 ^ b.num1;
    b.num1 = a.num1 ^ b.num1;
    a.num1 = a.num1 ^ b.num1;

    a.num2 = a.num2 ^ b.num2;
    b.num2 = a.num2 ^ b.num2;
    a.num2 = a.num2 ^ b.num2;
/*
    SwapObjects temp = a;
    a = b;
    b = temp;
  }
*/

   SwapObjects swap(SwapObjects a, SwapObjects b) {

    return a;
  }

  public static void main(String[] args) {

    SwapObjects a = new SwapObjects();
    a.num1 = 9;
    a.num2 = 0;
    
    SwapObjects b = new SwapObjects();
    b.num1 = 1;
    b.num2 = 2;

    a = a.swap(b, b = a);
    System.out.println(a.num1 + " " + a.num2);
  }
}
