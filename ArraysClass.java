import java.util.*;

public class ArraysClass {

    static void printArray(int[] arr) {

        for(int a : arr) {

            System.out.println(a);
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int [] arr = new int[5];
        Arrays.fill(arr, 6);
        printArray(arr);

        int[] arr2 = Arrays.copyOf(arr, 6);
        printArray(arr2);

        arr2 = Arrays.copyOf(arr, 2);
        printArray(arr2);

        String str = Arrays.toString(arr2);
//        str = Integer.toString(arr);
        System.out.println(str);
    }
}
