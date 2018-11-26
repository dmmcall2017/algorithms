package com.dmm.leetcode;

import java.util.HashMap;

public class Solution771 {
    static int numUniqueEmails(String[] emails) {
        int N = emails.length;
        HashMap<String,Integer> map = new HashMap<>();
        if(N>0&&N<=100){
            for(int i=0; i<N; i++){
                int len = emails[i].length();
                String[] arr = emails[i].split("@");
                if(0<len&&len<=100&&arr.length==2){
                    arr[0] = arr[0].substring(0,arr[0].indexOf("+")).replace(".","");
                    String newEmail = arr[0]+"@"+arr[1];
                    if(map.get(newEmail)==null){
                        map.put(newEmail,1);
                    }
                }
            }
        }
        return map.size();
    }
    public static void main(String[] args){
        String[] a = {"a","a","b","b","c","c","c"};
        int times = numUniqueEmails(a);
        System.out.print(times);
    }
}
