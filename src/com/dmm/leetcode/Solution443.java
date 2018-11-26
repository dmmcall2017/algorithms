package com.dmm.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution443 {
    static int compress(char[] chars) {
        int anchor = 0, write = 0;
        for (int read = 0; read < chars.length; read++) {
            if (read + 1 == chars.length || chars[read + 1] != chars[read]) {
                chars[write++] = chars[anchor];
                if (read > anchor) {
                    for (char c: ("" + (read - anchor + 1)).toCharArray()) {
                        chars[write++] = c;
                    }
                }
                anchor = read + 1;
            }
        }
        System.out.println(chars);
        return write;
    }
    public static void main(String[] args){
        char[] a = {'a','a','b','b','c','c','c','a','a','b','b','c','c','c','a','a','b','b','c','c','c','a','a','b','b','c','c','c','a','a','b','b','c','c','c','a','a','b','b','c','c','c'};
        int times = compress(a);
        System.out.println(times);
    }
}
