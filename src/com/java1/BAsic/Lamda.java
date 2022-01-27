package com.java1.BAsic;
        /*
        1.Creating an interface i.e it will only have the function declaration.
        2.Create an object of the interface and provide the arguments if any and
        define the function
        interface obj = () -> {def};
        3. Call the function
         */
import java.util.Scanner;

interface Sum{
   void calculate(int x, int y);
}

public class Lamda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Sum add = (x, y) -> System.out.println("The sum is " + (x + y));
        Sum diff =(x, y) -> System.out.println("The difference is "+ (x - y));
        add.calculate(a,b);
        diff.calculate(a,b);

    }
}
