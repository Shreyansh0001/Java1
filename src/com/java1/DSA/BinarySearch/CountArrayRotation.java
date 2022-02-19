package com.java1.DSA.BinarySearch;

public class CountArrayRotation {
    /*  Q: To find the number of times a sorted Array is rotated
    */
        int countOfArrayRotation(int[] arr,int l, int r) {
        int n = arr.length;
        if (n == 0)
            return 0;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            int prev = (mid + n -1) % n;
            int next = (mid + 1) % n;
            if (arr[prev] >= arr[mid] && arr[next] >= arr[mid])
                return mid;
            /* check from start to mid if its a sorted array or not - if yes ...we wil ommitt this half and check the other half
            mid = 11/2 = 5 - 5....since 18 22 25 2 3 5 is not sorted we will check this half for smallest element */
            else if (arr[mid] >= arr[l]){
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        } return 0;
    }
    public static void main(String[] args) {
        int arr[] = {18,22,25,2,3,5,7,12,14,15,17};
        CountArrayRotation obj = new CountArrayRotation();
        System.out.println(obj.countOfArrayRotation(arr,0,arr.length -1));
    }
}
