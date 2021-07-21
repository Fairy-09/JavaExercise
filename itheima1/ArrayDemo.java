package com.itheima1;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr=new int[2];
        int[] arr2=new int[3];
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[2]);
        arr[0]=100;
        arr2[0]=200;
        arr2[2]=300;
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[2]);
    }
}
