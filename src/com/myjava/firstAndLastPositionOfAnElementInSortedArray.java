package com.myjava;

import java.util.Arrays;
import java.util.Scanner;

public class firstAndLastPositionOfAnElementInSortedArray {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int []arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("Enter key :");
        int key= scan.nextInt();
        System.out.print(first(arr,key));
        System.out.print(Last(arr,key));


    }
    public static int first(int arr[],int key){

        int start=0;
        int f=-1;
        int end=arr.length-1;
        for(int i=start;i<=end;i++){
            int mid=start+(end-start)/2;
            if(arr[mid]==key){
                f=mid;
                end=mid-1;
            }
            else if(arr[mid]>key){
                end=mid-1;
            }
            else if(arr[mid]<key){
                start=mid+1;
            }
        }
        return f;
    }
    public static int Last(int arr[],int key){

        int start=0;
        int l=-1;
        int end=arr.length-1;
        for(int i=start;i<=end;i++){
            int mid=start+(end-start)/2;
            if(key == arr[mid]){
                l=mid;
                start=mid+1;
            }
            else if(arr[mid]>key){
                end=mid-1;
            }
            else if(arr[mid]<key){
                start=mid+1;
            }
        }
        return l;
    }
}
