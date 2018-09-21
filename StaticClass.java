class Static1 {

  static int count;
  int x = 0;
  
  static void method() {

    count++;
    x++;
    Static1 var = new Static1();
    var.x++;
  }
}

public class StaticClass {

  public static void main(String[] args) {

    System.out.println(Static1.count);
    Static1.method();
    System.out.println(Static1.count);
    
  }
}
