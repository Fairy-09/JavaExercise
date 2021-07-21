package com.itheima1;

import java.util.Scanner;

public class Fat1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the number of week:");
        int week = sc.nextInt();
        switch (week) {
            case 1:
                System.out.println("Run");
                break;
            case 2:
                System.out.println("Swim");
                break;
            case 3:
                System.out.println("Scroll");
                break;
            case 4:
                System.out.println("Bicycle");
                break;
            case 5:
                System.out.println("Climb");
                break;
            case 6:
                System.out.println("Bat");
                break;
            case 7:
                System.out.println("Eat");
                break;
            default:
                System.out.println("Wrong input!");


        }
    }
}
