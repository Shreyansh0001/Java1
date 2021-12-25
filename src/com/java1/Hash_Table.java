package com.java1;

import java.util.Map;
import java.util.Hashtable;


public class Hash_Table {
    public static void main(String[] args)
    {
        Map<Integer,String> ht = new Hashtable <Integer,String>();
        ht.put(44, "Dope");
        ht.put(54, "Hash");
        ht.put(76, "Rope");


        ht.remove(44);


        System.out.println(ht);

    }


}
