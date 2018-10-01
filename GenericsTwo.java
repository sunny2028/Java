public class GenericsTwo<T, V> {

    T key;
    V value;

    GenericsTwo(T key, V val) {

        this.key = key;
        this.value = val;
    }

    T getKey() {

        return key;
    }

    V getValue() {

        return value;
    }

    void getData() {

        System.out.println("Key : " + key + " value : " + value);
    }


    public static void main(String[] args) {

        GenericsTwo<Integer, String> obj1 = new GenericsTwo<>(12, "Ayush");
        System.out.println("Key : " + obj1.getKey());
        System.out.println("value: " + obj1.getValue());
 
        obj1.getData();
        System.out.println(obj1.getClass().getSimpleName());
    }
}
