package com.java1.DSA;

public class LongestCommonSubsequence {

    static int LCS(char[] str1,char[] str2, int n1, int n2,int[][] t){
        if(n1 == 0 || n2 == 0)
            return 0;
        if(t[n1][n2] != -1)
            return t[n1][n2];

        if(str1[n1-1] == str2[n2-1])
            return t[n1][n2] = (1 + (LCS(str1,str2,n1-1,n2-1,t)));
        else{
            return t[n1][n2] = (Math.max(LCS(str1,str2,n1,n2-1,t),LCS(str1,str2,n1-1,n2,t)));
        }
    }


    public static void main(String[] args) {
        String str1 = "ABC";
        char[] strar1 = str1.toCharArray();
        String str2 = "AB";
        char[] strar2 = str2.toCharArray();
        int n1 = str1.length();
        int n2 = str2.length();
        int[][] t = new int[n1+1][n2+1];
        for(int i=0;i<n1+1;i++){
            for(int j=0;j<n2+1;j++){
                t[i][j] = -1;
            }
        }
        System.out.println("Longest Common Substring is of size " + LCS(strar1,strar2,n1,n2,t));
}
}
