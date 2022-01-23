package com.java1.Codechef;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {

    // Iterative approach with O(n* rotate_number)
    /*static void rotateleft(int[] arr, int rotate) {
        int len = arr.length;
        for (int i = 0; i < rotate; i++)
            //leftrotatebyOne(arr, len);
            rightrotatebyOne(arr,len);
        System.out.println(Arrays.toString(arr));
    }

    static void rightrotatebyOne(int[] arr, int len) {
        int temp = arr[len-1];
        int i;
        for (i = len-1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
    }

    static void leftrotatebyOne(int[] arr, int len) {
        int temp = arr[0];
        int i;
        for (i = 0; i < len-1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[len - 1] = temp;
    }*/

    //2nd Approach using gcd in O(n)

    void leftRotate(int arr[], int d) {
        /* To handle if d >= n */
        int n = arr.length;
        d = d % n;
        int i, j, k, temp;
        int g_c_d = gcd(d, n);
        for (i = 0; i < g_c_d; i++) {
            /* move i-th values of blocks */
            temp = arr[i];
            j = i;
            while (true) {
                k = j + d;
                if (k >= n)
                    k = k - n;
                if (k == i)
                    break;
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
    }

    int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }

    }


    public static void main(String[] args) {
        ArrayRotation obj = new ArrayRotation();
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        Scanner sc = new Scanner(System.in);
        int rotate = sc.nextInt();
        obj.leftRotate(arr, rotate);
        System.out.println(Arrays.toString(arr));
    }
}
