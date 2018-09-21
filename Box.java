public class Box {

  double length;
  double breadth;
  double height;
  
  Box() {

    length = breadth = height = 0;
  }

  Box(double l, double b, double h) {

    length = l;
    breadth = b;
    height = h;
  }

  Box(double a) {

    length = breadth = height = a;
  }

  double volume() {

    return length * breadth * height;
  }

  void display() {

    System.out.println("\nLength : " + length + "\nBreadth : " + breadth + "\nHeight : " + height + "\nVolume : " + this.volume());
  }

  
  public static void main(String[] args) {}

}
