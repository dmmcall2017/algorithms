package com.janice.algorithms;
/*算法类模板*/
public class Template {
    /*sort 排序*/
    public static void sort(Comparable[] a){}
    /*less 比较*/
    private static boolean less(Comparable v, Comparable w){
        return v.compareTo(w) < 0;
    }
    /*exch 交换*/
    private static void exch(Comparable[] a, int i, int j){}

    private static void show(Comparable[] a){
        //在单行中打印数组
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    //测试元素是否有序
    private static boolean isSorted(Comparable[] a){
        for(int i=0; i<a.length; i++){
            if(less(a[i], a[i-1])){
                return false;
            }
        }
        return true;
    }
    //从标准输入中读取字符串，将它们排序并输出
    public static void main(String[] args){
//        String[] a =
    }
}
