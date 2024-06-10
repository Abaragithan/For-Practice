package Practice;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
          int[] arr = {8,3,9,3,2,1};
        //System.out.println(Arrays.toString(bubble(arr)));
        System.out.println(Arrays.toString(selection(arr)));
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




}
