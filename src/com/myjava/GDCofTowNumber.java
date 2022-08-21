package com.myjava;

import java.util.Scanner;

public class GDCofTowNumber {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        System.out.println("The GCD Of "+a+" , "+b+" is "+ gcd(a,b));

    }
    public static int  gcd(int a,int b){
        if(b==0){
            return a;
        }
        else{
            return gcd(b,a%b);
        }
    }
}
