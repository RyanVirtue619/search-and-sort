package search;

/**
 * Write a description of class Binary here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Binary
{

    /**
     * Returns the index of the target value, or -1 if not found
     */
    public static int search(int[] arr, int target) {
        int low = 0;
        int high = arr.length-1;
        int mid = 0;
        while(low <= high) {
            mid = (low+high)/2;
            if(arr[mid] == target) return mid;
            if(target < arr[mid]) {
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return -1;
        
    }
    
    public static int[] sort(int[] arr) {
        // Your algorithm goes here!
        int[] ar = arr;
        int i = 0;
        int j;
        int min;
        int temp;
        int minIndex;
        while(i < ar.length-1) {
            j = i;
            min = ar[j];
            minIndex = j;
            temp = ar[j];
            while(j < ar.length-1) {
                if(min > ar[j+1]) {
                    min = ar[j+1];
                    minIndex = j+1;
                }
                j++;
            }
            ar[i] = min;
            ar[minIndex] = temp;
            i++;
        }
        return ar;
    }
    
    public static void main(String[] args) {
        int[] arr = {53,85,93,25,39,27,42,5,24,45,33,51,5,80,4,7,91,
                31,66,71,32,19,79,58,61,82,89,63,7,4,50,10,48,24,75,19,22,
                73,54,51,25,33,20,52,79,97,70,54,63,49};
        
        // Remember that a binary search requires a sorted array!
        // You can use one of your sorting methods here.
        arr = sort(arr);
        ////////////////////////////////////////////////////////////
        // Do not change anything below this line!!
        ////////////////////////////////////////////////////////////
        boolean isSorted = true;
        for (int i=0; i<arr.length-1 && isSorted; i++) {
            if (arr[i] > arr[i+1]) {
                isSorted = false;
            }
        }
        System.out.println("TESTING");
        printResult("Is sorted?", isSorted);
        printResult(82, search(arr, 82) == 44); // Find index in unsorted or sorted array
        printResult(49, search(arr, 49) == 24);
        printResult(-4, search(arr, -4) == -1);
    }

    public static void printResult(int target, boolean result) {
        System.out.println("Search for "+target+": "+((result) ? "CORRECT" : "INCORRECT"));
    }

    public static void printResult(String target, boolean result) {
        System.out.println(target+": "+((result) ? "CORRECT" : "INCORRECT"));
    }

}
