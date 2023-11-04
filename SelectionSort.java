import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {15,6,2,12,4};
        SelectionSort.selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int j = findMin(arr, i);
            swap(arr, i, j);
        }
    }

    private static int findMin(int[] arr, int lower) {
        int currIndexMin = lower;
        for (int i = lower + 1; i < arr.length; i++)
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
