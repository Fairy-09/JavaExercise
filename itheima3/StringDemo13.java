package com.itheima3;

import java.util.Scanner;

public class StringDemo13 {
    public static void main(String[] args) {
        System.out.println("Please input string:");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s2=toReverse(s);
        System.out.println(s2);

    }
    public static String toReverse(String s){
        StringBuilder s1=new StringBuilder(s);
        s1.reverse();
        String s2=s1.toString();
        return s2;
        }
}
