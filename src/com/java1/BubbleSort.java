package com.java1;

import java.util.Arrays;

public class BubbleSort {
    
    public static void bubbleSort1(int[] arr){
        int size = arr.length;
        for(int i=0;i<size-1;i++)
        {
            for(int j=0;j < size - i -1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

    }

   public static void bubbleSort2(int[] arr){
        int size = arr.length;
        for(int i = 0; i< size -1;i++){
            boolean swapped = false;
            for(int j=0;j < size - i -1;j++){
                if (arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped)
               break;
        }
    }

/*10 20 15 45 50
 i =0 ---
 */







    public static void main(String[] args){
        int[] arr = {10,20,15,45,50};
        System.out.println("Before Sorting and time taken with break");
        System.out.println(Arrays.toString(arr));
//        long start = System.currentTimeMillis();
        BubbleSort.bubbleSort2(arr);
//        long end = System.currentTimeMillis();

        //System.out.println("With Break Diff after sorting = " + (end - start));
        System.out.println("After Sorting");
        System.out.println(Arrays.toString(arr));
//
//        start = System.currentTimeMillis();
//        BubbleSort.bubbleSort2(arr);
//        end = System.currentTimeMillis();
//        System.out.println("Without Break Diff after sorting = " + (end - start));
//        System.out.println(Arrays.toString(arr));
    }
}
/*
i = 24 23 55 34   size = 4

34 44 43 54 65 75


10 20 15 45 50
i = 0






      j = 24 23 55 34
i =0 j =0

 */