import java.util.Scanner;

public class ScannerClass {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int num = sc.nextInt();
    System.out.println("You Entered : " + num);
    
    System.out.println("Enter a line : ");
    sc.nextLine();    
    String line = sc.nextLine();
    System.out.println("You Entered : " + line);

    System.out.println("Enter a word : ");
    String word = sc.next();
    System.out.println("You entered : " + word);
    
//    sc.close();
  }
}
