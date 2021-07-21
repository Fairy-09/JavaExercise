package com.itheima1;
import java.util.Scanner;
public class Fat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please input the number of week:");
        int week=sc.nextInt();
        if(week<1||week>7){
            System.out.println("Wrong number");
        }else if(week==1){
            System.out.println("Run");
        }else if(week==2){
            System.out.println("Swim");
        }else if(week==3){
            System.out.println("Stroll");
        }else if(week==4){
            System.out.println("Bicycle");
        }else if(week==5){
            System.out.println("Bat");
        }else if(week==6){
            System.out.println("climb");
        }else {
            System.out.println("Eat");
        }
        }

    }

