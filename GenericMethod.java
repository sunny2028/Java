public class GenericMethod {

    <T>void type() {

        System.out.println(this.getClass().getSimpleName());
    }

    <T extends Number> void add(T a, T b) {

        System.out.println(a);
    }


    public static void main(String[] args) {

        GenericMethod t = new GenericMethod();

        t.type();
        t.add(1, 3);
//        System.out.println(t.add("Ayush ", "Singla")); // -> Gives error
    }
}
