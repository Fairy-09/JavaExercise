package com.itheima3;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Please input string:");
        String line=sc.nextLine();
        System.out.println("The input of yours is:"+line);
    }
}
