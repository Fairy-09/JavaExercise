package com.itheima3;

import java.util.Scanner;

public class StringDemo5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++){
            System.out.println(s.charAt(i));
        }
    }
}
