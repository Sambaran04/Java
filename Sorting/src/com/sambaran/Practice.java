package com.sambaran;

import static com.sambaran.Swap.swap;
import java.util.Arrays;
public class Practice {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println("Array before sorting: " + Arrays.toString(arr));
//        insertion(arr);
//        selection(arr);
//        bubble(arr);
//        mergeSort(arr, 0, arr.length-1);
        quickSort(arr, 0, arr.length-1);
        System.out.println("Array after sorting: " + Arrays.toString(arr));
//        System.out.println((int) 'a');
    }
    public static int partition(int[] arr, int l, int r){
        int pivot = arr[l];
        int i = l-1;
        int j=r+1;
        while(true) {
            do {
                i++;
            } while (arr[i] < pivot);
            do {
                j--;
            } while (arr[j] > pivot);
            if (i >= j) {
                return j;
            }
            swap(arr, i, j);
        }
    }
    public static void quickSort(int[] arr, int l, int r){
        if(l<r){
            int p = partition(arr, l, r);
            quickSort(arr, l, p);
            quickSort(arr, p+1, r);
        }
    }
}
