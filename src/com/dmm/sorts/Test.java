package com.dmm.sorts;


public class Test {
    public static void main(String args[]){
        Integer[] arr3 = { 13, 27, 49, 55, 4, 49, 38, 65, 97, 26 };
        Integer[] arr1 = { 13, 27, 49, 55,13,49, 4, 49, 38,27, 65, 97, 26,26,4 };
        Selection.sort(arr3);//选择排序
        Insertion.sort(arr3);//插入排序
        ShellSort.sort(arr3);//希尔排序
        System.out.print(Distinct.distinct(arr1));
    }
}
