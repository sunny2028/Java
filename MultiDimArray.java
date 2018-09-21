import java.util.*;

public class MultiDimArray {

    static void printArray(int[][] arr) {

        for(int[] i : arr) {

            for(int j : i) {

                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] arr = new int[][]{{100, 2, 36}, {388, 34, 50, 84, 17, 3, 1}};
        printArray(arr);

        int[][] arr2 = Arrays.copyOf(arr, arr.length);

        System.out.println("Both Arrays are equal : " + Arrays.deepEquals(arr, arr2));

        System.out.println(Arrays.deepToString(arr2));

        Arrays.sort(arr[1]);
        int [][]arr3 =Arrays.copyOf(arr2, arr.length);

        printArray(arr3);
    }
}



