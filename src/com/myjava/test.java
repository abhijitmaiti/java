package com.myjava;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int []arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println("Enter target element :-");
        int target=scan.nextInt();
        if(binarySearch(arr,target)>=0){
            System.out.println("The index is :"+binarySearch(arr,target));
        }
        else{
            System.out.println("Not Found");
        }
    }
    public static int  binarySearch(int []arr,int target) {
        int start=0;
        int end = arr.length-1;
        for(int i=start;i<end;i++){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }
            if(arr[start]<arr[end]){
                if(target<arr[mid]){
                    end=mid-1;
                }
                else if(target>arr[mid]){
                    start=mid+1;
                }

            }
            else{
                if(target<arr[mid]){
                    start=mid+1;
                }
                else if(target>arr[mid]){
                    end=mid-1;
                }
            }
        }
        return -1;

    }
}
