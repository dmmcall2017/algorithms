package com.dmm.sorts;

import com.dmm.utils.MainUtil;
import sun.applet.Main;

/**
 * 简单的希尔排序
 */
public class ShellSort {


    static Comparable[] sort(Comparable[] array){
        int N = array.length;//数组长度
        int step = 1;
        while(step < N/3)step = 3*step + 1;
        int i,j;
        while(step >= 1){
            for(i = step; i< N; i++){
                for(j = i; j >= step && MainUtil.less(array[j],array[j-step]); j -= step){
                    MainUtil.exch(array,j,j-step);
                }
            }
            step = step/3;
        }
        MainUtil.show(array);
        return array;
    }

//    static void sort(Comparable[] array){
//        int number = array.length / 2;
//        int i, j;
//        Comparable temp;
//        while (number >= 1) {
//            for (i = number; i < array.length; i++) {
//                temp = array[i];
//                j = i - number;
//                while (j >= 0 && MainUtil.less(temp,array[j])) {
//                    array[j + number] = array[j];
//                    j = j - number;
//                }
//                array[j + number] = temp;
//            }
//            number = number / 2;
//        }
//        MainUtil.show(array);
//    }
}
