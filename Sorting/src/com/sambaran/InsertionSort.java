package com.sambaran;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println("Your array is: "+ Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("Your sorted array is: "+ Arrays.toString(arr));
    }
    
    public static void insertionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (arr[j]<arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }   else break;
            }
        }
    }
}
