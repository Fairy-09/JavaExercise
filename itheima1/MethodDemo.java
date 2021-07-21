package com.itheima1;
import java.util.Scanner;

public class MethodDemo {
    public static void main(String[] args) {
        isEvenNumber();
        getMax();
    }
    public static void isEvenNumber(){
        int number=10;
        if (number%2==0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
    public static void getMax(){
        System.out.println("Please input the first number:");
        Scanner sc=new Scanner(System.in);
        int x1=sc.nextInt();
        System.out.println("Please input the second number:");
        int x2=sc.nextInt();
        if(x1!=x2){
            System.out.println("The max number is: "+(x1>x2?x1:x2));
        }else{
            System.out.println("Equal number! Please input again!");
        }

    }
}

