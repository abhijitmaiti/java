package com.myjava;

import java.util.Scanner;

public class binarySearch {
    public static void main(String []args){
        Scanner scan=new Scanner (System.in);
        Sytem.out.print("Enter number of element :")
        int n=scan.nextInt();
        int []arr=new int [n];
        System.out.print("Enter element in array : ")
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }

        System.out.print("Enter target element :");
        int target= scan.nextInt();
        if(binarySearch(arr,target)>=0){
            System.out.println("The index :"+binarySearch(arr,target));
        }
        else{
            System.out.println("Not found");
        }

    }
    public static int  binarySearch(int []arr,int target){
        int start=0;
        int end=arr.length-1;

        for(int i=start;i<end;i++){
            int mid=start+(end-start)/2;
            if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;


    }
}
