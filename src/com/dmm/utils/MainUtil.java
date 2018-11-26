package com.dmm.utils;

public class MainUtil {
    /**
     * 比较大小
     * v<w返回true
     */
    public static boolean less(Comparable v, Comparable w){
        return v.compareTo(w)<0;
    }

    /**
     * 交换位置
     * @param a,i,j
     */
    public static void exch(Comparable[] a,int i, int j){
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    /**
     * 打印结果
     */
    public static void show(Comparable[] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    /**
     * 判断输入的数组是否有序
     */
    public static boolean isSorted(int[] a){
        int N = a.length;
        for(int i = 1; i < N; i++){
            if(less(a[i],a[i-1])){
                return false;
            }
        }
        return true;
    }
}
