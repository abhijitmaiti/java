package com.myjava;

import java.util.Arrays;
import java.util.Scanner;

public class insertElementInArray {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int []arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        System.out.print("Enter pos :");
        int pos=scan.nextInt();
        System.out.print("Enter element :");
        int ele=scan.nextInt();
        System.out.println(Arrays.toString(insertElement(arr, n, pos, ele)));
    }
    public static int[] insertElement(int []arr,int n,int p,int el){
        int []newArr=new int[n+1];
        int j=0;
        for(int i=0;i<n+1;i++){
            if(i==p){
                newArr[i]=el;
            }
            else{
                newArr[i]=arr[j];
                j++;
            }

        }
        return newArr;
    }
}
