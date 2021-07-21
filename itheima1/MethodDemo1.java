package com.itheima1;

public class MethodDemo1 {
    public static void main(String[] args) {
        isEvenNumber(10);

        int number=10;
        isEvenNumber(number);
        getMax(12,24);
        int a=20;
        int b=34;
        getMax(a,b);
    }
    public static void isEvenNumber(int number){
        if(number%2==0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
    public static void getMax(int x1,int x2){
        System.out.println("The max number is : "+(x1>x2?x1:x2));
    }
}
