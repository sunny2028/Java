import java.util.Scanner;

public class MethodOverloading {

  static void print(int a) {
    
    System.out.println("You Entered Integer : " + a);
  }

  static void print(int a, int b) {

    System.out.println("You Entered 2 integers : " + a + " and " + b);
  }

  static void print(int a, String str) {

    System.out.println("You Entered Integer : " + a + " and String : " + str);
  }

  static void print(String str, int i) {

    System.out.println("You Entered String : " + str + " and Integer : " + i);
  }

/*  static void print(int [] arr) {

    System.out.println("you entered array of size: " + arr.length);
    for(int i : arr) {

      System.out.println(i);
    }
  }
*/
  static void print(int ... arr) {

    System.out.println("You entered array of length : " + arr.length);
  }


  static void print(int a, int ...arr) {

    System.out.println("An integer and Array of length : " + arr.length);
  }

  public static void main(String[] args) {

    print(1);
    print(2, 53);
    print("Hello Ayush", 27);
    print(654, "Bhaag jao");
    print(1, 2, 3, 4, 5, 6, 6);
  }
}
