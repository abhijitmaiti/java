package com.myjava;

import java.util.Scanner;

public class sumOfOddNumber {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        System.out.println("The Sum of Odd Number :"+oddSum(n));


    }
    public static int oddSum(int a){
        int sum=0;
        for(int i=1;i<=a;i++){
            if(i%2!=0){
                sum=sum+i;
            }

        }
        return sum;
    }
}
