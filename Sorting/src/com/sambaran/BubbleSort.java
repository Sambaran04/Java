package com.sambaran;

import java.util.Arrays;

//import static com.sambaran.Swap.swap;
import com.sambaran.Swap.*;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println("Your array is: "+ Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("Your sorted array is: "+ Arrays.toString(arr));
    }
    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int count =0;
            for (int j = 1; j < arr.length-i; j++) {
                if (arr[j]<arr[j-1]){
                    swap(arr, j-1, j);
                    count++;
                }
            }
            if (count==0)break;
        }
    }
}
