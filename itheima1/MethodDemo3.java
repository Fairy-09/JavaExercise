package com.itheima1;

//方法重载
public class MethodDemo3 {
    public static void main(String[] args) {
        int result=sum(10,20);
        System.out.println(result);
        double result2=sum(10.0,20.0);
        System.out.println(result2);
        int result3=sum(10,20,30);
        System.out.println(result3);

    }
    public static int sum(int x1,int x2){
        return x1+x2;
    }
    public static double sum(double x1,double x2){
        return x1+x2;
    }
    public static int sum(int x1,int x2, int x3){
        return x1+x2+x3;
    }
}
