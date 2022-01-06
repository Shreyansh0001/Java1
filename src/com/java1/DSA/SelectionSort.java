package com.java1.DSA;

import java.util.Arrays;

public class SelectionSort {

    static void selectionSort(int[] arr){
        int size = arr.length;
        for(int i=0;i<size-1;i++){
            int min_idx = i;
            for(int j=i+1;j< size;j++)
            {
                if(arr[j] < arr[min_idx]){
                    min_idx = j;
                }
            }
            int temp =  arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = {34,54,13,65};  // 12 54 34 65 // 12 34 54 65
        System.out.println("Before Sorting");
        System.out.println(Arrays.toString(arr));

        SelectionSort.selectionSort(arr);
        System.out.println("After Sorting");
        System.out.println(Arrays.toString(arr));
    }
}
