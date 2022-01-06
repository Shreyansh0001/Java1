package com.java1;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Streamexample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("akash");
        names.add("Shransh");
        names.add("Tushar");
        names.add("abc");
        names.add("xyz");
        names.add("qwer");

        long start = System.currentTimeMillis();
       // List<String> filtered_name = names.stream().filter(name -> name.startsWith("a")).map(name -> name.toUpperCase()).collect(Collectors.toList());
        String filtered_name = names.stream().filter(name -> name.startsWith("a")).map(name -> name.toUpperCase()).findFirst().orElse(null);
        //long end = System.currentTimeMillis();
        //System.out.println("Stream Diff = " + (end - start));
        System.out.println(filtered_name);
        start = System.currentTimeMillis();
//        for (String name: names) {
//                if (name.startsWith("a")) {
//                    System.out.println(name);
//                }
//        }
//        end = System.currentTimeMillis();
//            System.out.println("For each Diff = " + (end - start));
        }
}

