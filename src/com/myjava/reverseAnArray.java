package com.myjava;

import java.util.Arrays;
import java.util.Scanner;

public class reverseAnArray {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int []arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println(Arrays.toString(reversArray(arr,n)));
    }
    public static int [] reversArray(int []arr,int n){
        int j=n;
        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
        return arr;
    }
}
