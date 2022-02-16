package com.java1.Codechef;

public class SquareRoot {
    public int mySqrt(int x) {
        // return (int)Math.sqrt(x);
        //sqrt will lie between 0 ....x
        if(x < 2)
            return x;
        int left =0;
        int right = x;
        int res = 0;
        while(right >= left){
            int mid = left + (right - left)/2;
            if(mid == x/mid)
                return (int)mid;
            else if(mid < x/mid){
                res = mid;
                left = mid +1;
            }else{
                right = mid -1;
            }
        }
        return (int)res;
    }

    public static void main(String[] args) {
        int num =8;
        SquareRoot obj = new SquareRoot();
        System.out.println(obj.mySqrt(num));
    }
}
