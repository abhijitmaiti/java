package com.myjava;

import java.util.Scanner;

public class countPositiveNeagtiveAndZero {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }

        counting(arr);

    }
    public static void counting(int []a){
        int positiveNumberCount=0;
        int negativeNumberCount=0;
        int zeroCount=0;
        for(int i=0;i< a.length;i++){

            //positive Number
            if(a[i]>0){
                positiveNumberCount++;
            }
            else if(a[i]==0){
                zeroCount++;
            }
            else if(a[i]<0){
                negativeNumberCount++;
            }
        }
        System.out.println("The positive Number :"+positiveNumberCount);
        System.out.println("The negative Number :"+negativeNumberCount);
        System.out.println("The zero :"+zeroCount);
    }
}
