package com.java1.Codechef;

import java.util.Scanner;

class functions{
    static int sq(int x){
        return (x* x);
    }

    static int cube(int x) {
        return (x * x * x);
    }
}

public class KeplersLaw extends functions{

    public static void main(String[] args) {
        functions f = new functions();
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        int[][] arr = new int[T][4];
        for(int i=0;i<T;i++)
        {
            for(int j=0;j<4;j++)
            {
                arr[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }
        for(int i=0;i<T;i++)
        {
            float n1 = f.sq(arr[i][0]);
            float n2 = f.cube(arr[i][2]);
            float n3 = f.sq(arr[i][1]);
            float n4 = f.cube(arr[i][3]);
                float s1 = n1/n2;
                float s2 = n3/n4;
               if(s1 == s2)
                     System.out.println("Yes");
                else
                     System.out.println("No");
        }
    }
}
