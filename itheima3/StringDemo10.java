package com.itheima3;

public class StringDemo10 {
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder();
        s.append("hello");
        String s1=s.toString();
        System.out.println(s1);

        String s2="Hello";
        StringBuilder s3=new StringBuilder(s2);
        System.out.println(s3);
    }
}
