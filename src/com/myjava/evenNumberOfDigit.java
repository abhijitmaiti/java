package com.myjava;

import java.util.Scanner;

public class evenNumberOfDigit {
    public static void main(String []args){
        Scanner scan=new Scanner (System.in);
        int n=scan.nextInt();
        int []arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println("There are :"+evenDigit(arr));
    }
    public static int  evenDigit(int[] arr){
        int evenCount=0;
        for(int i=0;i<arr.length;i++){
            String numString=" ";
            numString= String.valueOf(arr[i]);
            int len=numString.length();
            if(len%2==0){
                evenCount++;
            }
        }
        return evenCount;
    }
}
