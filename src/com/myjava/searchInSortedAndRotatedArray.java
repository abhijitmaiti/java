package com.myjava;

import java.util.Scanner;

public class searchInSortedAndRotatedArray {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        System.out.println("Enter number of element  :");
        int n=scan.nextInt();
        int []arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println("Enter target element :");
        int target= scan.nextInt();
        System.out.println(searchInSortedRotatedArray(arr,target));

    }
    public static int searchInSortedRotatedArray(int []arr,int target){
        int p=pivot(arr);
         if(arr[p]<=target && arr[arr.length-1]>=target){
             int start=p;
             int end=arr.length-1;
             int m=start+(end-start)/2;
             while(start<=end){
                if(arr[m]==target){
                    return m;
                }
                else if (arr[m]<target){
                    start=m+1;
                }
                else if(arr[m]>target){
                    end=m-1;
                }
                m=start+(end-start)/2;
            }
        }
         else{
             int end=p;
             int start=0;
             int m=start+(end-start)/2;
             while(start<=end){
                 if(arr[m]==target){
                     return m;
                 }
                 else if (arr[m]<target){
                     start=m+1;
                 }
                 else if(arr[m]>target){
                     end=m-1;
                 }
                 m=start+(end-start)/2;
             }

         }
         return -1;

    }
    public static int pivot(int []arr){
        int s=0;
        int e=arr.length-1;
        int mid=s+(e-s)/2;
        while(s<e){
            if(arr[mid]>=arr[0]){
                s=mid+1;
            }
            else{
                e=mid;
            }
            mid=s+(e-s)/2;
        }
        return e;

    }
}
