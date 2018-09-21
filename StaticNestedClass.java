class Outer {

    int x = 2;
    static int y = 1;

    static class Inner {

        static int z = 12;
        int i = 13;
        
        void display() {

            System.out.println("y : " + y);
            Outer o = new Outer();
            System.out.println("x : " + o.x);
        }
    }

    void print() {

        System.out.println("z : " + Inner.z);
    }
}

class StaticNestedClass {

    public static void main(String[] args) {

        Outer obj = new Outer();
        obj.print();
        Outer.Inner i = new Outer.Inner();
        i.display();
    }
}
