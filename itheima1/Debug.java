package com.itheima1;

public class Debug {
    public static void main(String[] args) {
        int sum=0;
        for(int i=1;i<=10;i++){
            if(i%2==0){
                sum=sum+i;
            }
        }
        System.out.println("Sum of even from 1-10:"+sum);
    }
}

