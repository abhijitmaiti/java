package com.myjava;

import java.util.Scanner;

public class fibonnaciSeries {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=0;i<=n;i++){
            System.out.print(series(i)+",");
        }

    }
    public static int  series(int n){
        if(n==0 || n==1){
            return n;
        }
        else{
            return series(n-1)+series(n-2);
        }

    }
}
