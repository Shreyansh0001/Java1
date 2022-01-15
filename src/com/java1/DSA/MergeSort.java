package com.java1.DSA;

public class MergeSort {

     void merge(int[] arr,int l,int mid, int r){
        int i = l;
        int j = mid+1;
        int k =l;
        int[] t = new int[r+1];

        /*for (int a=l;a<=r;a++) {
             t[a] = arr[a];
         }*/

        while(i <= mid && j <= r){
            if(arr[i] <= arr[j]){
                t[k] = arr[i];
                i++;
            }else{
                t[k] = arr[i];
                j++;
            }
            k++;
        }
        if(i > mid) {
            while(j <= r) {
                t[k] = arr[i];
                j++;
                k++;
            }
        }else {
            while(i<= mid) {
                t[k] = arr[i];
                i++;
                k++;
            }
        }
        for(k =l;k<r;k++)
        {
            arr[k] = t[k];
        }
    }

    public void sort(int[] arr, int l ,int r){
        if(l < r) {
            int mid = l + (r-l) / 2;
            sort(arr, l, mid);
            sort(arr, mid + 1, r);
            merge(arr, l, mid, r);
        }
    }

    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 12, 11, 13, 5, 6, 7 };
        System.out.println("Before Sorting");
        printArray(arr);

        MergeSort obj = new MergeSort();
        obj.sort(arr, 0, arr.length -1);

        System.out.println("After Sorting");
        printArray(arr);
    }
}

