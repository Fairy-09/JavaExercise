package com.itheima1;

import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        int[] arr=new int[6];
        for(int i=1;i<=arr.length;i++){
            System.out.println("Please input the "+i+"th score of judger:");
            Scanner sc=new Scanner(System.in);
            arr[i-1]=sc.nextInt();
        }
        int max=getMax(arr);
        int min=getMin(arr);
        int sum=getSum(arr);
        int avg=(sum-max-min)/(arr.length-2);
        System.out.println("The AVG of the competitor is:"+avg);

    }
    public static int getMax(int[] arr){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            max=max>arr[i]?max:arr[i];
        }
        return max;
    }
    public static int getMin(int[] arr){
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            min=min<arr[i]?min:arr[i];
        }
        return min;
    }
    public static int getSum(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        return sum;
    }
}
