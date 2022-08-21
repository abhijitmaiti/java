package com.myjava;

import java.util.Arrays;
import java.util.Scanner;

public class removeDublicateElementInArray {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        int []arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println(Arrays.toString(dublicateElement(arr, n)));

    }
    public static int[] newArray(int[]arr,int count){
        int []newArr=new int[count-1];
        int p=0;
        for(int i=0;i<count-1;i++){
            newArr[i]=arr[p];
            p++;
        }
        return newArr;
    }
    public static int[] dublicateElement(int []arr,int n){
        int count=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    continue;
                }
                else{
                    if(arr[i]==arr[j]){
                        for(int k=j;k< arr.length-1;k++){
                            arr[k]=arr[k+1];
                        }
                        count++;
                        break;
                    }
                }
            }
        }
        return newArray(arr,count);
    }
}
