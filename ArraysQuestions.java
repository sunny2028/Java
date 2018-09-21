import java.util.*;

public class ArraysQuestions {

    int [] arr = new int[]{1000, 20000, 300, 124 ,3 ,4236, 735, 865};
    
    int len() {

        return arr.length;
    }

    void sort(int start, int end) {

        Arrays.sort(arr, start, end);
    }

    void sort() {

        Arrays.sort(arr);
    }

    void copy(ArraysQuestions obj, int start, int end) {

        arr = Arrays.copyOfRange(obj.arr, start, end);
    }

    void copy(ArraysQuestions obj) {

        arr = Arrays.copyOf(obj.arr, obj.arr.length);
    }

    void replace(int ind1, int ind2, int val) {

        arr[ind1] = arr[ind2] = val;
    }

    void printArray() {

        for(int a : arr) {

            System.out.println(a);
        }
        System.out.println();
    }


    public static void main(String[] args) {

        ArraysQuestions obj1 = new ArraysQuestions();
        System.out.println("length of Array : " + obj1.len() + "\n");
  
        obj1.sort(2, 4);
        obj1.printArray();
 
        obj1.sort();
        obj1.printArray();

        ArraysQuestions obj2 = new ArraysQuestions();
        obj2.copy(obj1, 1, 5);
        obj2.printArray();
  
        obj2.copy(obj1);
        obj2.printArray();

        obj2.replace(3, 4, 40);
        obj2.printArray();

        System.out.println("3 found at pos : " + Arrays.binarySearch(obj2.arr, 3));
    } 
}
