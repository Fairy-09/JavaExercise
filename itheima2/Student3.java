package com.itheima2;

public class Student3 {
    private String name;
    private int age;

    public Student3(String name){
        this.name=name;
    }

    public Student3(){

    }

    public Student3(int age){
        this.age=age;
    }

    public Student3(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void show(){
        System.out.println(name+","+age);
    }
}
