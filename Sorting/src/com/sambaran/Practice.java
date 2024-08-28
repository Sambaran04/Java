package com.sambaran;

import java.util.Arrays;

import static com.sambaran.Swap.swap;

public class Practice {
    public static void main(String[] args) {
//        int[] arr = {5, 4, 3, 2, 1};
//        System.out.println("Array before sorting: " + Arrays.toString(arr));
//        mergeSort(arr, 0, arr.length - 1);
//        System.out.println("Array after sorting: " + Arrays.toString(arr));
        System.out.println((int) 'a');
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int low, int mid, int high) {
        int ls = mid - low + 1;
        int rs = high - mid;
        int[] left = new int[ls];
        int[] right = new int[rs];
        for (int i = 0; i < ls; i++) {
            left[i] = arr[low + i];
        }
        for (int i = 0; i < rs; i++) {
            right[i] = arr[mid + i + 1];
        }
        int i = 0, j = 0, k = low;
        while (i < ls && j < rs) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
                k++;
            } else {
                arr[k] = right[j];
                j++;
                k++;
            }
        }
        while (i < ls) {
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < rs) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }
}
