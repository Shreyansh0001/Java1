package com.java1.Codechef;

import java.util.HashMap;

public class LongestSubstring1 {
    // PROBLEM: to find longest substring with k unique characters

    static boolean valid(HashMap<Character, Integer> hm, int k) {
        if (hm.size() == k) {
            return true;
        } else {
            return false;
        }
    }

    static void kUniques(String s, int k) {
        int i = 0, j;
        boolean maxStatus = false;
        int len = s.length();
        char[] ch = s.toCharArray();
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        String str, max = "";
        for (i = 0; i < len; i++) {
            for (j = i; j < len; j++) {
                if (hm.containsKey(ch[j])) {
                    hm.put(ch[j], hm.get(ch[j]) + 1);
                } else {
                    hm.put(ch[j], 1);
                }
            }
            str = String.valueOf(ch, i, j - i);
            maxStatus = LongestSubstring1.valid(hm, k);
            if (maxStatus && str.length() >= max.length()) {
                max = str;
            }
            hm.clear();
        }
        System.out.println("Longest substring with " + k + " unique characters is " + max);
    }

    public static void main(String[] args) {
        String s = "aabacbebebe";
        int k = 3;
        kUniques(s, k);
    }

}


