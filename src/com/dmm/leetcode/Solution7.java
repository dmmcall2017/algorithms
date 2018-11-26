package com.dmm.leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * reverse integer
 */
class SolutionDemo {
    static int reverse(int x) {
        int result = 0;

        while (x != 0) {
            int tail = x % 10;
            int newResult = result * 10 + tail;
            if ((newResult - tail) / 10 != result) {
                return 0;
            }
            result = newResult;
            x = x / 10;
        }

        return result;
    }
    public static boolean isPalindrome(int x) {
        char[] arr = String.valueOf(x).toCharArray();
        int N = arr.length;
        Boolean flag = true;
        for(int i =0;i<N/2;i++){
            if(arr[i] != arr[N-1-i]){
                flag = false;
                break;
            }
        }
        return flag;
    }
}
public class Solution7 {
    public static void main(String[] args) throws IOException {
        System.out.print(SolutionDemo.isPalindrome(111111111));
    }
}
