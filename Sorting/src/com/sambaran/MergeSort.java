package com.sambaran;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        mergeSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void merge(int[] arr, int l, int m, int r) {
        int ls = m - l + 1;
        int rs = r - m;
        int[] left = new int[ls];
        int[] right = new int[rs];

        for (int i = 0; i < ls; i++) {
            left[i] = arr[l + i];
        }
        for (int i = 0; i < rs; i++) {
            right[i] = arr[m + i + 1];
        }

        int i = 0, j = 0, k = l;

        while (i < ls && j < rs) {
            if (left[i] > right[j]) {
                arr[k] = right[j];
                j++;
                k++;
            } else {
                arr[k] = left[i];
                i++;
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

    public static void mergeSort(int[] arr, int l, int r) {
        int mid = l + (r - l) / 2;
        if (l < r) {
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);
            merge(arr, l, mid, r);
        }
    }
}
