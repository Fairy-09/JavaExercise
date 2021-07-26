package com.itheima3;

import java.util.Scanner;

public class StringDemo6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s=sc.nextLine();
        int countH=0;
        int countL=0;
        int countD=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='A'&&s.charAt(i)<='Z'){
                countH++;
            }
            if(s.charAt(i)>='a'&&s.charAt(i)<='z'){
                countL++;
            }
            if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
                countD++;
            }
        }
        System.out.println("字符串中大写字母 "+countH+" 个");
        System.out.println("字符串中小写字母 "+countL+" 个");
        System.out.println("字符串中数字 "+countD+" 个");
    }
}
