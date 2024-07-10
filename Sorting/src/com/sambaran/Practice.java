package com.sambaran;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println("Array before sorting: "+Arrays.toString(arr));
//        cyclicSort(arr);
//        selection(arr);
        bubble(arr);
        System.out.println("Array after sorting: "+Arrays.toString(arr));
    }

    public static void selection(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                swap(arr, i, j);
            }
        }
    }

    public static void bubble(int[] arr){
        for (int i=0; i<arr.length; i++){
            for (int j=1; j<arr.length-i; j++){
                if(arr[j-1]>arr[j]) swap(arr, j-1, j);
            }
        }
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
