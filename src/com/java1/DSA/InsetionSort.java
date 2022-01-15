package com.java1.DSA;

import java.util.Arrays;

public class InsetionSort {

    static void insertionSort(int[] arr){
        int size = arr.length;
        for(int i=1;i<size;i++){
            int key = arr[i];
            int j = i-1;

            while(j >= 0 && key < arr [j]){
                arr[j+1] = arr[j];
                --j;
            }
            arr[j+1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {23,13,6,98};
        System.out.println("Before Sorting");
        System.out.println(Arrays.toString(arr));

        InsetionSort.insertionSort(arr);

        System.out.println("After Sorting");
        System.out.println(Arrays.toString(arr));
    }
}
