package com.myjava;

import java.util.Scanner;

public class orderAgnosticBinarySearch {
    public static void main(String []args){
        Scanner scan=new Scanner (System.in);
        int n=scan.nextInt();
        int []arr=new int [n];
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
    public static int binarySearch(int[]arr,int target){
        int start=0;
        int end =arr.length-1;
        for(int i=start;i<end;i++){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            boolean order=arr[start]<arr[end];
            if(order==true){
                if(arr[mid]>target){
                    end=mid-1;
                }
                else if(arr[mid]<target){
                    start=mid+1;
                }
            }
            else{
                if(arr[mid]>target){
                    start=mid+1;
                }
                else if(arr[mid]<target){
                    end=mid-1;
                }

            }
        }
        return -1;
    }
}
