package com.java1.DSA;

public class BinarySearch {
    /*int binarySearch(int[] arr, int key, int l, int r) {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == key)
                return mid;
            if (arr[mid] > key) {
                return binarySearch(arr, key, l, mid - 1);
            } else
                return binarySearch(arr, key, mid + 1, r);
        }
        return -1;
    }*/

    int first(int[] arr, int key, int l, int r) {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == key && (mid == 0 || key > arr[mid - 1]))
                return mid;
            else if (key > arr[mid])
                return first(arr, key, (mid + 1), r);
            else
                return first(arr, key, l, mid - 1);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 5, 5, 5, 5, 7, 12, 54, 65, 98}; //ascecnding
        BinarySearch obj = new BinarySearch();
        int key = 5;
        int mid = obj.first(arr, key, 0, arr.length);
        if (mid == -1)
            System.out.println("Element not found");
        else
            System.out.println("The index for Element " + key + " is " + mid);
    }
}

//Ctrl + Shift + Alt + L