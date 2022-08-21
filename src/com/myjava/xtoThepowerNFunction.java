package com.myjava;

import java.util.Scanner;
import java.lang.Math.*;
public class xtoThepowerNFunction {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        int n=scan.nextInt();
        System.out.println("Result :"+power(x,n));

    }
    public static int power(int x,int n){
        return (int )(Math.pow(x,n));
    }
}
