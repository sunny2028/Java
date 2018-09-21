public class LabeledBlocks {

  public static void main(String[] args) {

    first : {

      System.out.println("First...");
      second : {

          System.out.println("Second..");
          break first;
        }
      System.out.println("End of first");
    }
  } 
}
