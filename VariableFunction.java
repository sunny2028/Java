import java.util.Scanner;

public class VariableFunction { 

  static void func(int ... arr) {

    System.out.println("-> " + arr.length);
    for(int i : arr) {

      System.out.print(i + " ");
    }
    System.out.println();
  }

  public static void main(String[] ags) {

    func(1, 2, 3, 4, 5);
    func();
    func(1);
  }
}
