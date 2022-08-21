package com.myjava;

import java.util.Arrays;
import java.util.Scanner;

public class insertElementWithoutSecondArray {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int []arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println("enter p and t");
        int p= scan.nextInt();
        int t= scan.nextInt();
        System.out.println(Arrays.toString(fun(arr,p,t)));
    }
    public static int[] fun(int[]arr,int p,int t){
        for(int i=0;i<arr.length;i++){
            if(i==p){
                arr[i+1]=arr[i];
                arr[i]=t;
            }

        }
        return arr;


    }
}
