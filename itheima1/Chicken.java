package com.itheima1;

public class Chicken {
    public static void main(String[] args) {
        for(int i=0;i<=20;i++){
            for(int j=0;j<=33;j++){
                int z=100-i-j;
                if(5*i+3*j+z/3==100 & z%3==0){
                    System.out.println("---------------");
                    System.out.println("Cock:"+i);
                    System.out.println("Hen:"+j);
                    System.out.println("Chick:"+z);
                }
                }
            }
        }
}
