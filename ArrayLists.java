import java.util.ArrayList;

public class ArrayLists {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<String> arrString = new ArrayList<>();

        System.out.println("Size of arr : " + arr.size());
        System.out.println("Size of arrString : " + arrString.size());

        arr.add(5);
        arr.add(8);

        arrString.add("Hello Doston..");
        arrString.add("Chai Peeeloo...");

        System.out.println("Size of arr : " + arr.size());
        System.out.println("Size of arrString : " + arrString.size());

        arr.add(2, 98);
        arr.add(0, 32);
        arr.add(4, 9);

        arrString.set(1, "Kaise hooo..");

        System.out.println(arr);
        System.out.println(arrString);

        for(int i = 0; i < 15; i++) {

            arr.add(i % 5);
        }

        System.out.println(arr);

        System.out.println("Index of 2 is : " + arr.indexOf(2));
        System.out.println("Last Index of 2 is : " + arr.lastIndexOf(2));

        arr.remove(6);

        System.out.println("After removing index 6: \n" + arr);

        System.out.println("Value at index 5 : " + arr.get(5));
        System.out.println("Contains 6 : " + arr.contains(6));

        Integer[] intArr = new Integer[arr.size()];
        intArr = arr.toArray(intArr);

        System.out.println("Array : ");

        for(int i : intArr) {

            System.out.println(i);
        }

        arr.clear();
        System.out.println(arr);
    }
}
