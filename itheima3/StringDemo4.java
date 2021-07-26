package com.itheima3;

import java.util.Scanner;

public class StringDemo4 {
    public static void main(String[] args) {
        String admUser="LiMing";
        String admPsw="123123";
        System.out.println("用户登录系统");
        System.out.println("-----------");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++){
            System.out.println("请输入用户名：");
            String user=sc.nextLine();
            System.out.println("请输入密码：");
            String psw=sc.nextLine();
            if(user.equals(admUser)&&psw.equals(admPsw)){
                System.out.println("登陆成功！");
                break;
            }else{
                if(2-i==0){
                    System.out.println("您的账户已锁定，请与管理员联系！");
                }else{
                    System.out.println("登陆失败！你还有 "+(2-i)+" 次机会！");
                }
            }
        }
    }
}
