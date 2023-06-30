package hw5.Solutions;

import java.util.Arrays;

public class HeapSort {

    public static void heapSort(int[] arr) {
        for (int i = arr.length / 2; i > 0; i--) {
            int childIndex = (i - 1) / 2;
            swap(arr, i, childIndex);
            heapify(arr, childIndex, i);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void heapify(int[] arr, int parent, int child) {
        if (child > 0) {
            int largestChild = child;
            for (int j = child / 2 + 1; j <= child; j++) {
                if (arr[parent] < arr[j]) {
                    largestChild = j;
                    break;
                }
            }
            if (largestChild != child) {
                swap(arr, largestChild, child);
                heapify(arr, parent, largestChild);
            }
        }
    }
}
