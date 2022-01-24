package com.java1.DSA;

public class KnapSack10 {


    public int knapSack(int[] val, int[] wt, int W, int n, int[][] t) {
        if (n == 0 || W == 0)
            return 0;
        if (t[n][W] != -1) {
            return t[n][W];
        }
        if (wt[n - 1] <= W)
            return t[n][W] = Math.max(val[n - 1] + knapSack(val, wt, W - wt[n - 1], n - 1, t), knapSack(val, wt, W, n - 1, t));
        else
            return t[n][W] = knapSack(val, wt, W, n - 1, t);
    }

    public static void main(String[] args) {
        KnapSack10 obj = new KnapSack10();
        int[] val = {60, 100, 120};
        int[] wt = {10, 20, 30};
        int W = 50;
        int n = val.length;
        int[][] t = new int[n + 1][W + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < W + 1; j++)
                t[i][j] = -1;
        }
        System.out.println("The max profit is " + obj.knapSack(val, wt, W, n, t));
    }
}
