package com.myjava;

import java.util.Arrays;
import java.util.Scanner;

public class leetcode35 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int []arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println("Enter target element :");
        int target= scan.nextInt();
        System.out.println(searchInsertPosition(arr,target));
    }
    public static int searchInsertPosition(int []arr,int target){
        Arrays.sort(arr);
        int start=0;
        int end=arr.length-1;
        int mid=start+(end-start)/2;
        while(start<=end){
            if(arr[0]<target){
                if(arr[mid]==target || arr[mid]>target && arr[mid-1]<target ){
                    return mid;
                }
                else if(arr[arr.length-1]<target){
                    return arr.length;
                }

                else if(arr[mid]>target){
                    end=mid-1;
                }
                else if(arr[mid]<target){
                    start=mid+1;
                }

            }
            else{
                return 0;
            }
            mid=start+(end-start)/2;
        }
        return -1;


    }
}
