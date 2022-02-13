package com.java1.Practice;

import java.util.HashSet;

public class Uniqueelement {
    public int removeDuplicates(int[] nums) {
        int i=0, k=0;
        while(k<nums.length && nums[i] == nums[k]){
            k++;
            if(k==nums.length) break;
            if(nums[k]!=nums[i]){
                nums[++i] = nums[k];
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        Uniqueelement obj = new Uniqueelement();
        int[] nums = {-3,-1,0,0,0,3,3};
        int k = obj.removeDuplicates(nums);
        System.out.println(k);
        for (int i = 0; i <= k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
