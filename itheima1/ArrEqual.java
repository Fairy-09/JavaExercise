package com.itheima1;

public class ArrEqual {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 56, 6};
        int[] arr1 = {1, 4, 3, 56, 6};
        int[] arr2 = {353, 3242, 342, 34, 2};
        System.out.println(compare(arr,arr2));
    }
    public static boolean compare(int[] arr,int[] arr1){
        if (arr.length != arr1.length) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr1[i]) {
                return false;
            }
        }
        return true;
    }
}
