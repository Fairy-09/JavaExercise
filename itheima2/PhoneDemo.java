package com.itheima2;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone p=new Phone();   //new出来的对象放在堆内存中

        System.out.println(p.brand);
        System.out.println(p.price);

        p.brand="小米";
        p.price=2999;

        System.out.println(p.brand);
        System.out.println(p.price);

        p.call();
        p.sendMessage();
    }
}
