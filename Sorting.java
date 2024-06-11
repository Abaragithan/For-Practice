package Practice;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
          int[] arr = {0,-3,6,9,7,3,5,1};
          System.out.println(Arrays.toString(bubble(arr)));
          System.out.println(Arrays.toString(selection(arr)));
          System.out.println(Arrays.toString(insertion(arr)));
    }

    // selection sort method
    private static int[] selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - 1 - i;
            int maxIndex = findMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
        return arr;
    }

    // method for swapping two elements
    private static void swap(int[] arr, int maxIndex, int last) {
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[last];
        arr[last] = temp;
    }

    // method for finding maximum in an array
    private static int findMaxIndex(int[] arr, int start, int last) {
        int max = start;
        for (int i = 0; i <= last; i++) {
            if (arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }

    // bubble sort method
    private static int[] bubble(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean isSwaped = false;
            for (int j = 1; j < arr.length-i-1; j++) {
                if (arr[j] < arr[j - 1]){
                    int swap = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = swap;
                    isSwaped = true;
                }
            }
            if (!isSwaped) return arr;
        }
        return arr;
    }

    // insertion sort method
    private static int[] insertion(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j - 1] > arr[j]){
                    swap(arr, j - 1, j);
                } else break;
            }
        }
        return arr;
    }



}
