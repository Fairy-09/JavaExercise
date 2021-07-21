package com.itheima1;

public class Reverse {
    public static void main(String[] args) {
        int[] arr={19,28,37,46,50};
        int temp;
        for(int i=0;i<arr.length/2;i++){
            temp=arr[arr.length-i-1];
            arr[arr.length-i-1]=arr[i];
            arr[i]=temp;
        }
        System.out.print("[");
        for(int i=0;i<arr.length;i++){
            if(i!=arr.length-1) {
                System.out.print(arr[i]);
                System.out.print(",");
            }else{
                System.out.print(arr[i]);
            }
        }
        System.out.print("]");

    }
}
