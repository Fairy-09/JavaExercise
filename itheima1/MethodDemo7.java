package com.itheima1;

public class MethodDemo7 {
    public static void main(String[] args) {
        int[] arr={1,23,23,345,456,54,765,75,34,3};
        System.out.println("Max:"+getMax(arr));
    }
    public static int getMax(int[] arr){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            max=max>arr[i]?max:arr[i];
        }
        return max;
    }
}
