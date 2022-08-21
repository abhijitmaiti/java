package com.myjava;

import java.util.Arrays;
import java.util.Scanner;

public class sortAnArrayOf012 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter number of element in Array :");
        int n=scan.nextInt();
        int []arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println(Arrays.toString(sort(arr)));
    }
    public static int [] sort(int []arr){
        int start=0;
        int end=arr.length-1;
        int mid=0;
        for(int i=mid;i<=end;i++){
            if(arr[mid]==0){
                int temp=arr[mid];
                arr[mid]=arr[start];
                arr[start]=temp;
                mid++;
                start++;

            }
            else if (arr[mid]==1){
                mid++;
            }
            else if(arr[mid]==2){
                int temp=arr[mid];
                arr[mid]=arr[end];
                arr[end]=temp;
                end--;
                mid++;

            }

        }
        return arr;
    }
}
