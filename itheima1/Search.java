package com.itheima1;

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        int[] arr={19,28,37,46,50};
        Scanner sc=new Scanner(System.in);
        System.out.println("Please input a number:");
        int x=sc.nextInt();
        System.out.println(search(x,arr));
    }
    public static int search(int x,int[] arr){
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == x) {
                    return i;
                }
            }
            return -1;
        }
}
