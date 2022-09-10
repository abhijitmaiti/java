package com.myjava;

import java.util.Arrays;
import java.util.Scanner;

public class insertionSort {
    public static void main(String[] args) {
        System.out.println("Enter a number :");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]= scan.nextInt();
        }
        System.out.println(Arrays.toString(insertionSort(n,a)));

    }
    public static int[] insertionSort(int n , int[] arr) {
        // Write your code here.
        for(int i=1;i<n;i++){
            int temp=arr[i];
            int j=i-1;
            while(j>=0){
                if(arr[j]>temp){
                    arr[j+1]=arr[j];
                }
                else{
                    break;
                }
                j--;
            }
            arr[j+1]=temp;
        }
        return arr;
    }
}
