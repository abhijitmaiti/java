package com.myjava;

import java.util.Arrays;
import java.util.Scanner;

public class sort012 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int []arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println(Arrays.toString(sort(arr)));

    }
    public static int[] sort(int []arr){
        int start=0;
        int mid=0;
        int end=arr.length-1;
        while(mid<=end){
            if(arr[mid]==0){
                int temp=arr[start];
                arr[start]=arr[mid];
                arr[mid]=temp;
                mid++;
                start++;
            }
            else if(arr[mid]==1){
                mid++;

            }
            else if(arr[mid]==2){
                int temp=arr[end];
                arr[end]=arr[mid];
                arr[mid]=temp;
                end--;


            }
        }
        return arr;
    }
}
