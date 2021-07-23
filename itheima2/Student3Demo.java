package com.itheima2;

public class Student3Demo {
    public static void main(String[] args) {
        Student3 s=new Student3("LiMing");
        s.show();
        Student3 s1=new Student3();
        s1.show();
        Student3 s2=new Student3(12);
        s2.show();
        Student3 s3=new Student3("XiaoHong",18);
        s3.show();
    }
}
