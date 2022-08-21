package com.myjava;

import java.util.Scanner;

public class linearSearch {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int []arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        if(arr.length==0){
            System.out.print("Array length 0");
        }
        else{
            System.out.print("Enter target element :");
            int target=scan.nextInt();
            if(linearSearch(arr,target)>0){
                System.out.print("The index :"+linearSearch(arr,target));
            }
            else{
                System.out.print("Not found");
            }
        }

    }
    public static int  linearSearch(int []arr,int target){
        for(int index=0;index<arr.length;index++){
            if(target==arr[index]){
                return index;
            }
        }
        return -1;
    }
}
