package com.dmm.sorts;

import com.dmm.utils.MainUtil;

/**
 * 数组去重（在原数组上）
 */
public class Distinct {
    static int distinct(Comparable[] arr){//不同元素的个数
        int N = arr.length;
        int len = 0;
        arr = ShellSort.sort(arr);
        Comparable a = 0;
        for(int i=0; i<N; i++){
            if(arr[i] != a){
                len++;
                a = arr[i];
            }
        }
        return len;
    }
    
}
