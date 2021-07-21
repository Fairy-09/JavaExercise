package com.itheima1;

public class MethodDemo2 {
    public static void main(String[] args) {
        boolean x = isEvenNumber(5);
        System.out.println(x);
        int max = getMax(23, 45);
        System.out.println(max);
    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

/*    public static int getMax(int x1, int x2) {
        if (x1 == x2) {
            System.out.println("Equal!");
        } else if (x1 > x2) {
            return x1;
        } else {
            return x2;
        }
    }*/

    public static int getMax(int x1,int x2){
        if(x1>x2){
            return x1;
        }else{
            return x2;
        }
    }
}
