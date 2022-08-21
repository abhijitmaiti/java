package com.myjava;

import java.util.Arrays;
import java.util.Scanner;

public class movingAllElementToEnd {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter number of element in array :");
        int n=scan.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println(Arrays.toString(movingEnd(arr)));

    }
    public static int [] movingEnd(int []arr) {
        int start=0;
        int end= arr.length-1;
        while(start<end){
            if(arr[start]==0){
                start++;
            }
            else if(arr[start]==1 && arr[end]==0){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                end--;
                start++;
            }
            else if(arr[end]==1){
                end--;
            }

        }
        return arr;

    }
}
