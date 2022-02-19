package com.java1.DSA.BinarySearch;
/*
    Nearly sorted means that an element which is supposed to be at "i" position can either be at "i" or "i+1" or "i-1"
*/
public class NearlySortedArray {
    int nearlysortedbs(int[] arr,int l,int r,int key){
        int n = arr.length;
        while(l <= r){
            int mid = l + (r-l)/2;
            if(arr[mid] == key) {
                return mid;
            }else if((mid -1 >= 0) && arr[mid -1] == key) {
                return mid - 1;
            }else if((mid + 1 <= n) && arr[mid + 1] == key) {
                return mid + 1;
            }else if(arr[mid] > key) {
                r = mid - 2;
            }else {
                l = mid + 2;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 23, 21, 40};
        NearlySortedArray obj = new NearlySortedArray();
        int key = 6;
        System.out.println(obj.nearlysortedbs(arr,0,arr.length -1,key));

    }
}
