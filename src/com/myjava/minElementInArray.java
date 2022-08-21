package com.myjava;

import java.util.Scanner;


public class minElementInArray {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]= scan.nextInt();
        }
        System.out.println("The Min Number is :" +minElement(arr,n));
    }
    public static int minElement(int[]arr,int n){
        int min=arr[0];
        int max=arr[0];
        for(int i=1;i<n;i++){
            if(min>arr[i]){
                min=arr[i];
            }
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("The Max Element :"+max);
        return min;
    }

}

