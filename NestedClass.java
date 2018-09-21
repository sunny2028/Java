class Outer {

    static int x1;
    private int x2 = 3;
    int x3;

    class Inner {

        int y;
        void display() {

            System.out.println("y is " + y);
        }
    }

    void print() {

        System.out.println("x1 : " + x1 + ", x2 : " + x2 + ", x3 : " + x3);
    }
}

public class NestedClass {
    public static void main(String[] args) {

        Outer obj = new Outer();
        obj.x1 = 0;
//        obj.x2 = 1;
        obj.x3 = 2;

        obj.print();

        Outer.Inner obj_in = new Outer().new Inner();
        obj_in.y = 7;
        obj_in.display();
    }
}
