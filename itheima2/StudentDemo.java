package com.itheima2;

public class StudentDemo {
    public static void main(String[] args) {
        Student s=new Student();
        System.out.println(s.age);
        System.out.println(s.sname);
        System.out.println(s.sno);

        s.sno=20210722;
        s.sname="XiaoMing";
        s.age=20;

        System.out.println(s.sno);
        System.out.println(s.sname);
        System.out.println(s.age);

        s.Exercise();
        s.ReadBook();
    }
}
