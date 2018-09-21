public class ShapesOne {

    double rad;
    double height;
    final static double pi = 3.14;

    ShapesOne(double a, double b) {

        rad = a;
        height = b;
    }

    ShapesOne(int a) {

        rad = a;
    }

    double volCone() {
  
        return (pi * rad * rad * height) / 3;
    }

    double volSphere() {

        return (4 * pi * rad * rad * rad) / 3;
    }

    public static void main(String[] args) {

        ShapesOne cone = new ShapesOne(12, 13);
        ShapesOne sphere = new ShapesOne(15);

        System.out.println("Vol of Cone : " + cone.volCone());
        System.out.println("Vol of Sphere : " + sphere.volSphere());
    }
}
