package com.itheima2;

public class Student2 {
    private String name;
    private int age;

/*    public void setName(String n){
        name=n;
    }*/

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

/*    public void setAge(int a){
        age=a;
    }*/

    public void setAge(int age){
        this.age=age;
    }

    public int getAge(){
        return age;
    }

    public void show(){
        System.out.println(name+","+age);
    }
}
