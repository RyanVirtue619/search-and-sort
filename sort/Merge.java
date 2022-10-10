package sort;

import java.util.Arrays;

/**
 * Write a description of class Merge here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Merge
{

    /**
     * Returns the sorted array
     */
    public static int[] sort(int[] arr) {
        int[] ar = arr;
        int N = ar.length;
        if(N <= 1) return ar;
        int middle = N/2;
        int leftLength = middle;
        int rightLength = N - leftLength;
        int index = 0;
        int[] left = new int[leftLength];
        int[] right = new int[rightLength];
        return ar;
    }
    
    public static int[] mergeSort(int[] arr, int left, int middle, int right) {
        
    }
    
    public static 
    
    public static int[] Merge(int[] left, int[] right) {
        int[] marged = new int[left.length + right.length];
        int indexLeft = 0;
        int indexRight = 0;
        int index = 0;
        while(indexLeft < left.length-1 && indexRight < right.length-1) {
           if(left[indexLeft] > right[indexRight]) {
               marged[index] = left[indexLeft];
               indexLeft++;
           } else {
               marged[index] = right[indexRight];
               indexRight++;
           }
           index++;
        }
        return marged;
    }

    public static void main(String[] args) {
        int[] arr = {53,85,93,25,39,27,42,5,24,45,33,51,5,80,4,7,91,
                31,66,71,32,19,79,58,61,82,89,63,7,4,50,10,48,24,75,19,22,
                73,54,51,25,33,20,52,79,97,70,54,63,49};    

        // Test the sort
        testSort(sort(arr));
    }

    public static void testSort(int[] arr) {
        for (int i=0; i<arr.length-1; i++) {
            if (arr[i] > arr[i+1]) {
                System.out.println("FAIL at index "+i);
                System.out.println(Arrays.toString(arr));
                return;
            }
        }
        System.out.println("SUCCESS!");
    }

}
