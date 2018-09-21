public class BoxObject {

  public static void main(String[] args) {

    Box box1 = new Box(1);
    System.out.println("Volume Box1 : " + box1.volume());
    
    Box box2 = new Box(10, 20, 30);
    box2.display();
//    System.out.println("Volume Box2 : " + box2.volume());
  }
}
