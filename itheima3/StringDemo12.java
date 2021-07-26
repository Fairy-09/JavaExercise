package com.itheima3;

public class StringDemo12 {
    public static void main(String[] args) {
        int[] a={1,2,3};
        System.out.println(toArray(a));
    }
    public static String toArray(int[] a){
        StringBuilder s=new StringBuilder();
        s.append("[");
        for(int i=0;i<a.length;i++){
            if(i==a.length-1){
                s.append(a[i]);
            }else{
                s.append(a[i]).append(",");
            }
        }
        s.append("]");
        String s1=s.toString();
        return s1;
    }
}
