package com.myjava;

import java.util.Arrays;
import java.util.Scanner;

public class rowColumnSortedMatrix {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        int m= scan.nextInt();
        int [][]arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=scan.nextInt();
            }
        }
        System.out.print("Enter target element :");
        int t=scan.nextInt();
        System.out.println(Arrays.toString(searchIn2DArray(arr, n, t)));

    }
    public static int[] searchIn2DArray(int [][]arr,int n,int target){
        int row=0;
        int col=arr.length-1;
        for(int i=row;i<col;i++){
            if(arr[row][col]==target){
                return new int[]{row,col};
            }
            else if(arr[row][col]<target){
                row++;
            }
            else if(arr[row][col]>target){
                col--;
            }

        }
        return new int[]{-1,-1};

    }
}
