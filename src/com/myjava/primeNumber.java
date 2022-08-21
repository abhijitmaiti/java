package com.myjava;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[]args){
        int n;
        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();
        primeNumber(n);
    }
    public static void primeNumber(int num){
        int flag=0;
        for(int i=2;i<num;i++){
            if(num%(i)==0){
                flag=1;
                break;
            }
            else{
                flag=0;
            }
        }
        if(flag==0){
            System.out.println("prime number");
        }
        else{
            System.out.println("Not prime number");
        }
    }
}
