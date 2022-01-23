package com.java1.Codechef;

import java.util.Scanner;

public class BinaryPrime {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while (test-- != 0) {
            String input = sc.nextLine();
            boolean flag = input.contains("10") || input.contains("11");
            if (flag) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
