package com.itheima3;

public class StringDemo11 {
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder();
        int[] a={1,2,3};
        for(int i=0;i<a.length;i++){
            s.append(a[i]);
        }
        System.out.println("[");
        System.out.println(s);
        System.out.println("]");
    }
}
