import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListOfArrayList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 0;
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();

        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i < 3; i++) {

//            list.clear();
            ArrayList<Integer> list2 = new ArrayList<>();
            while(n != -1) {
                n = sc.nextInt();
                list2.add(n);
            }
            arr.add(list2);
            n = 0;
        }

//        list.clear();
        for(ArrayList<Integer> list2 : arr) {

            for(int n1 : list2) {

                System.out.print(n1 + " - ");
            }
            //list2.clear();
            System.out.println();
        }

        System.out.println("Size of arr : " + arr.size() + "\nSize of each list : ");

//        list.clear();
        for(ArrayList<Integer> list2 : arr) {

            System.out.println("Size : " + list2.size());
        }

        arr.get(2).set(1, 400);

        int max = -999999999;
//        list.clear();
        for(ArrayList<Integer> list2 : arr) {

            for(int n1 : list2) {

                if(max < n1) max = n1;
            }
        }

        System.out.println("value max element is " + max);
    }
}
