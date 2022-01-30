package com.java1.Codechef;

import javax.xml.stream.StreamFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

public class SumPair {
    /*
    arr = [1,4,1,4,2,5,5,3]
    sum = 5
    find all pairs whose sum = 5. A pair with index (0,1) is valid but again (1,0) is invalid
    */
    public static void main(String[] args) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int[] arr = {1, 4, 1, 4, 2, 5, 5, 3};
        int len = arr.length;
        int sum = 5;
        int i = 0;
        int temp = 0, diff = 0;
        while (len-- > 0) {
            hm.putIfAbsent(arr[i], 0);
            if (hm.containsKey(arr[i])) {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            }
            diff = sum - arr[i];
            if (hm.containsKey(diff)) {
                temp = hm.get(diff);
                while (temp > 0) {
                    System.out.println("( " + arr[i] + "," + diff + " )");
                    temp--;
                }
            }
            i++;
        }
    }
}
