package com.myjava;

import java.util.Arrays;
import java.util.Scanner;

public class selectionSort {
    public static void main(String[] args) {
        System.out.print("Enter number of element  :");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter value :");
            arr[i]= scan.nextInt();
        }
        System.out.println(Arrays.toString(selectionSort(arr,n)));


    }
    public static int[] selectionSort(int []arr, int n){
        for(int i=0;i<n-1;i++){
            int c=i;
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    c=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[c];
            arr[c]=temp;
        }
        return arr;

    }
}
