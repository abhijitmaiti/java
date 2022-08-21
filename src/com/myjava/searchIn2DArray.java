package com.myjava;

import java.util.Scanner;

public class searchIn2DArray {
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int m=scan.nextInt();
        int [][]arr=new int [n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]= scan.nextInt();
            }
        }
        if(arr.length==0){
            System.out.println("Empty array");
        }
        else{
            System.out.print("Enter target element :");
            int target=scan.nextInt();
            int []newArr=searchIn2D(arr,n,m,target);
            for(int i=0;i< newArr.length;i++){
                System.out.print(newArr[i]+",");
            }
//            searchIn2D(arr,n,m,target);
        }

    }
    public static int [] searchIn2D(int  [][]arr, int n,int m,int t){
        int []a=new int [2];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(t==arr[i][j]){
                    int ans=i;
                    for(int k=0;k<a.length;k++){
                        a[k]=ans;
                        ans=j;
                    }
                    break;
                }
            }
        }
//        for(int i=0;i<a.length;i++){
//            System.out.print(a[i]);
//        }
        return a;



    }
}
