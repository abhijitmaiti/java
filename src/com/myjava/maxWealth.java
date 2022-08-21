package com.myjava;

import java.util.Scanner;

public class maxWealth {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int m=scan.nextInt();
        int [][]arr=new int [n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]= scan.nextInt();
            }
        }
        System.out.println("Max Wealth :"+maxWealthOfPerson(arr,n,m));
    }
    public static int  maxWealthOfPerson(int [][]arr,int n,int m){
        int maxWealth=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<m;j++){
                sum=sum+arr[i][j];
            }
            if(maxWealth<sum){
                maxWealth=sum;
            }
        }
        return maxWealth;
    }
}
