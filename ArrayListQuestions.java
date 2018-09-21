import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class ArrayListQuestions {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter 10 integers : ");
        int num;

        // Enter 10 integers in arraylist
        for(int  i = 0;i < 10; i++) {

            num = sc.nextInt();
            arr.add(num);
        }

        System.out.println("Size of arraylist : " + arr.size());

        // Printing Elements of arraylist
        for(int i : arr) {

            System.out.println(i);
        }

        System.out.print("Enter a number to check for existance : ");
        num = sc.nextInt();

        // Checks whether the number exists or not
        System.out.println("ArrayList contains " + num + " is " + arr.contains(num));

        if(arr.contains(num)) System.out.println("Found first at index : " + arr.indexOf(num));

        System.out.print("Enter an index to delete : ");
        num = sc.nextInt();

        // Deletes value at given index
        arr.remove(num);

        System.out.println(arr);

        // Returns maximum element of arraylist
        System.out.println("Max of arraylist is : " + Collections.max(arr));

        // Reverses arraylist
        Collections.reverse(arr);

        System.out.println(arr);

        // Reversing arraylist using getter and setter
        int size = arr.size();
        for(int i = 0; i < size / 2; i++) {

            int temp = arr.get(i);
            arr.set(i, arr.get(size - i - 1));
            arr.set(size - i - 1, temp);
        }

        System.out.println(arr);

        // Clears the elements of whole array
        arr.clear();

        System.out.println("New size of list is : " + arr.size());
    }
}
