package com.itheima3;

import java.util.Scanner;

public class StringDemo3 {
    public static void main(String[] args) {
        String admUser="LiMing";
        String admPsw="123123";
        System.out.println("用户登录系统");
        System.out.println("------------");
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入用户名：");
        String user=sc.nextLine();
        System.out.println("请输入密码：");
        String psw=sc.nextLine();
        for(int i=0;i<2;i++){
            if(user.equals(admUser)&&psw.equals(admPsw)){
                System.out.println("登录成功！");
                break;
            }else{
                System.out.println("用户名或密码错误，请重新输入!");
                System.out.println("请输入用户名：");
                user=sc.nextLine();
                System.out.println("请输入密码：");
                psw=sc.nextLine();
            }
        }

    }
}
