package com.itheima1;

public class MethodDemo6 {
    public static void main(String[] args) {
        int[] x={1,3,5,4,4325,54,6};
        through(x);
    }
    public static void through(int[] x){
        System.out.print("[");
        for(int i=0;i<x.length;i++){
            if(i!=x.length-1) {
                System.out.print(x[i] + ", ");
            }else{
                System.out.print(x[i]);
            }
        }
        System.out.print("]");
    }

}
