import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {15,6,2,12,4};
        System.out.println("Original Array: " + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int j = findMin(arr, i, arr.length-1);
            swap(arr, i, j);
        }
    }

    private static int findMin(int[] arr, int lower, int upper) {
        int currIndexMin = lower;
        for (int i = lower + 1; i <= upper; i++)
            if (arr[i] < arr[currIndexMin])
                currIndexMin = i;
        return currIndexMin;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

/*
Original Array: [15, 6, 2, 12, 4]
Sorted Array: [2, 4, 6, 12, 15]
 */

