package com.itheima2;

public class Student1 {
    String name;
//    int age;
    private int age;

    public void setAge(int a){
        if(a<0||a>120){
            System.out.println("Wrong age!");
        }else{
            age=a;
        }

    }
    public int getAge(){
        return age;
    }

    public void show(){
        System.out.println(name+","+age);
    }
}
