public class ShapesTwo {

    double length;
    double breadth;

    ShapesTwo(double a) {

        length = a;
        breadth = a;
    }

    ShapesTwo(double a, double b) {

        length = a;
        breadth = b;
    }

    double getArea() {

        return length * breadth;
    }
  
    double getPerimeter() {

        return 2 * (length + breadth);
    }

    void getDimensions() {

        System.out.println("Length : " + length + "\nBreadth : " + breadth);
    }

    
    public static void main(String[] args) {

        ShapesTwo rect = new ShapesTwo(10, 20);
        ShapesTwo square = new ShapesTwo(25);

        System.out.println("Area of square : " + square.getArea());
        System.out.println("Area of rectangle : " + rect.getArea());

        System.out.println("Perimeter of square : " + square.getPerimeter());
        System.out.println("Perimeter of rectangle : " + rect.getPerimeter());
  
        System.out.println("Dimensions of square : ");
        square.getDimensions();
        
        System.out.println("Dimensions of rectangle : ");
        rect.getDimensions();
    }
}
