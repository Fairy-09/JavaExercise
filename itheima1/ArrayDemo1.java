package com.itheima1;

public class ArrayDemo1 {
    public static void main(String[] args) {
/*        int[] arr={1,2,3};
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);*/

//        ArrayIndexOutOfBoundsException
/*        int[] arr=new int[3];
        System.out.println(arr[3]);*/

//        NullPointerException
/*        int[] arr=new int[3];
        arr=null;
        System.out.println(arr[0]);*/

//      遍历
/*        int[] arr={22,33,23,24,34,35,23,13,43,43,43,54,65,675,76,76,786};
        int arrnum=arr.length;
        for(int i=0;i<arrnum;i++) {
            System.out.println(arr[i]);
        }*/

//      Max
/*
        int[] arr={213,23,23,43,245,46,54,756,867,345,34,2,43};
        int max=arr[0];
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]>max){
                max=arr[i+1];
            }
        }
        System.out.println(max);
*/

//      Min
        int[] arr={123,343,56,47,3254,35,34,654,654,63,45,34,5};
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);

    }
}
