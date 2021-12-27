package com.java1;

import java.util.List;
import java.util.ArrayList;

public class foreach {
    public static void main(String[] args){
        List<Integer> al =new ArrayList<Integer>();
        al.add(45);
        al.add(76);
        al.add(67);
        for(Integer n:al) {
            System.out.println(n);
        }
    }
}
