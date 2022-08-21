package com.myjava;

import java.util.Scanner;

public class avgOfThreeNumber {
    public static void main(String[]args){
        float a,b,c;
        Scanner scan=new Scanner(System.in);
        a=scan.nextFloat();
        b=scan.nextFloat();
        c= scan.nextFloat();
        System.out.println("The Avg Of Three Number :"+averageOfThreeNumber(a,b,c));

    }
    public static float averageOfThreeNumber(float a,float b,float c){
        float sum=a+b+c;
        return (sum/3);
    }
}
