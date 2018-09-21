public class CodeBlocks {

  static {

    System.out.println("Hello static block... eeeeee");
  }

  {
    System.out.println("B4 cons");
  }

  CodeBlocks() {

    System.out.println("In cons");
  }

  {
    System.out.println("After cons");
  }

  static {

    System.out.println("Hello static 2 block");
  }

  public static void main(String[] args) {

    System.out.println("hello  prohgram");
    CodeBlocks c = new CodeBlocks();
    CodeBlocks c2 = new CodeBlocks();
    int a = 7;
    {
//      System.out.println();
      int a = 8; 
    }
  }
}
