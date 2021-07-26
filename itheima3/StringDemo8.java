package com.itheima3;

import java.util.Scanner;

public class StringDemo8 {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串：");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1=rev(s);
        System.out.println("反转后的字符串为："+s1);
    }
    public static String rev(String s){
        String s1="";
        for(int i=s.length()-1;i>=0;i--){
            s1+=s.charAt(i);
        }
        return s1;
    }

}
