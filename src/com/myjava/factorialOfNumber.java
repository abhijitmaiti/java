package com.myjava;

import java.util.Scanner;

public class factorialOfNumber {
    public static void main(String[]args){
        int n;
        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();
        System.out.println("The Factorial :"+factorialOfNumber(n));
    }
    public static int factorialOfNumber(int num){
        int mul=1;
        if(num<0){
            System.out.println("invalid ");
        }
        else{
            for(int i=num;i>0;i--){
                mul=mul*i;

            }
        }

        return mul;

    }
}
