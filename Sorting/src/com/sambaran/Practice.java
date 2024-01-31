package com.sambaran;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println("Array before sorting: "+Arrays.toString(arr));
        cyclicSort(arr);
        System.out.println("Array after sorting: "+Arrays.toString(arr));
    }
    public static void cyclicSort(int[] arr){
        int i=0;
        while(i< arr.length){
            int correct = arr[i]-1;
            if (arr[i] != arr[correct]){
                swap(arr, i, correct);
            }else i++;
        }
    }
    public static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
