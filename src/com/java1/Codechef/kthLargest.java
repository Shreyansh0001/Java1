package com.java1.Codechef;

import java.util.Arrays;
import java.util.Scanner;

public class kthLargest {
    //find kth largest element in an array

    void sortRight(int[] arr,int k, int l, int r)
    {
        int mid =  l + (r - l)/2;
        int ref = arr[mid];

    }

    void sortLeft(int[] arr, int k, int l, int r)
    {

    }

    public static void main(String[] args){
        kthLargest obj = new kthLargest();
        int arr[] = {54,43,2,5,35,63,65,22};
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = arr.length;
        if(n - k < k){
            obj.sortRight(arr,k,0,n-1);
        }else{
            obj.sortLeft(arr,k,0,n-1);
        }
        System.out.println(Arrays.toString(arr));
    }

}
