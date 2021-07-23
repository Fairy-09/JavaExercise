package com.itheima2;

public class Student4Demo {
    public static void main(String[] args) {
        Student4 s=new Student4();
        s.show();

        Student4 s1=new Student4();
        s1.setAge(20);
        s1.setName("XiaoMing");
        s1.show();

        Student4 s2=new Student4("Xiaohua",18);
        s2.show();
    }
}
