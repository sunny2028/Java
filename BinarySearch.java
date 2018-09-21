public class BinarySearch {

    static int binarysearch(int[] arr, int start, int end, int target) {

        if(start > end) return -1;

        int mid = start + (end - start) / 2;
        if(arr[mid] == target) return mid;
        if(arr[mid] < target) return binarysearch(arr, mid + 1, end, target);
        else return binarysearch(arr, start, mid - 1, target);
    }

    public static void main(String[] args) {

        int arr[] = new int[7];
        int i;
        for(i = 0; i < 7; i++) {

            arr[i] = i;
        }

        System.out.println("Found at position : " + binarysearch(arr, 0, 6, 5));
    }
}
