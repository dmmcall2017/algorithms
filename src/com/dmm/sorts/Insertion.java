package com.dmm.sorts;

import com.dmm.utils.MainUtil;

/**
 * 简单的插入排序
 */
public class Insertion {
    static void sort(Comparable[] a){
        int N = a.length;
        for(int i=1; i<N; i++){
            for(int j=i; j>0&&MainUtil.less(a[j],a[j-1]); j--){
                MainUtil.exch(a,j,j-1);
            }
        }
        MainUtil.show(a);
    }
}
