package com.itheima3;

public class StringDemo9 {
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder();
        s.append("Hello");
        s.append(100);
        System.out.println(s);
        StringBuilder s1=new StringBuilder();
        s1.append("Hello").append(100);
        System.out.println(s1);
        s1.reverse();
        System.out.println(s1);
    }
}
