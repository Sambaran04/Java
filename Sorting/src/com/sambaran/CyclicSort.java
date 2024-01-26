package com.sambaran;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println("Your array is: "+ Arrays.toString(arr));
        cyclicSort(arr);
        System.out.println("Your sorted array is: "+ Arrays.toString(arr));
    }

    public static void cyclicSort(int[] arr){
        int i=0;
        while (i< arr.length){
            int correct = arr[i]-1;
            if (arr[correct] != arr[i]){
                swap(arr, correct, i);
            }else i++;
        }
    }
    public static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
