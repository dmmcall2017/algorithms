package com.dmm.sorts;
import com.dmm.utils.MainUtil;


/**
 * 简单的选择排序
 */
public class Selection {
    static void sort(Comparable[] a){
        int N = a.length;
        for(int i = 0; i<N; i++){
            int min = i;
            for(int j = i+1; j<N; j++){
                if(MainUtil.less(a[j], a[min])){
                    min = j;
                }
            }
            MainUtil.exch(a,i,min);//在外层循环内，剩余部分的最小值与第i个元素交换
        }
        MainUtil.show(a);
    }
}
