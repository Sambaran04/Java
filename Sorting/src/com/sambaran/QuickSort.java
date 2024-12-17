package com.sambaran;

import java.util.Arrays;

import static com.sambaran.Swap.swap;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println("Array before sorting: " + Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Array after sorting: " + Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int l, int r) {
        if (l < r) {
            int q = lomuto(arr, l, r);
//            quickSort(arr, l, q); // for Hoar Method
            quickSort(arr, l, q-1); // For Lomuto Method
            quickSort(arr, q + 1, r);
        }
    }

    public static int lomuto(int[] arr, int l, int r) {
        int x = arr[r];
        int i = l - 1;
        for (int j = l; j < r; j++) {
            if (arr[j] <= x) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, r);
        return i + 1;
    }

    public static int hoar(int[] arr, int l, int r) {
        int x = arr[l];
        int i = l - 1;
        int j = r + 1;
        while (true) {
            do {
                i++;
            } while (arr[i] < x);
            do {
                j--;
            } while (arr[j] > x);
            if (i >= j) {
                return j;
            }
            swap(arr, i, j);
        }
    }
}
