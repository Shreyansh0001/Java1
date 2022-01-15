package com.java1.Codechef;

import java.util.Scanner;

public class Covisprd {

    public static void main(String[] args) {
        double pop;
        double day;
        int test;
        double cov;
        Scanner sc = new Scanner(System.in);
        test = sc.nextInt();
        while(test > 0)
        {
            pop = sc.nextInt();
            day = sc.nextInt();
            if(day <= 10){
                cov = Math.pow(2,day);
            }else{
                cov = Math.pow(2,10) * Math.pow(3,(day-10));
            }
            System.out.println((int)cov);
            test--;
        }

    }
}

