public class Generics<T> {

    T val;

    Generics(T val) {

        this.val = val;
    }

    T getData() {

        return val;
    }

    void type() {

        System.out.println(val.getClass().getSimpleName());
    }

    public static void main(String[] args) {

        Generics<Integer> i = new Generics<>(12);
        Generics<String> s = new Generics<>("hello");

        i.type();
        s.type();
    }
}
