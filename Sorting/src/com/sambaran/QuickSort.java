package com.sambaran;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        quickSort(arr, 0, arr.length-1);
        for (int i:arr){
            System.out.print(i + " ");
        }
    }

    public static int partition(int[] arr, int l, int r){
        int x = arr[r];
        int i = l-1;
        for (int j = l; j <= r-1; j++) {
            if (arr[j]<=x){
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, r);
        return i+1;
    }

    public static void quickSort(int[] arr, int l, int r){
        if (l<r){
            int p = partition(arr, l, r);
            quickSort(arr, l, p-1);
            quickSort(arr, p+1, r);
        }
    }

    public static void swap(int[]arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
