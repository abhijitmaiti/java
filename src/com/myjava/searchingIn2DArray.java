package com.myjava;

import java.util.Scanner;

public class searchingIn2DArray {
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        int row=scan.nextInt();
        int col=scan.nextInt();
        int [][] arr=new int [row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]= scan.nextInt();
            }
        }
        int search;
        System.out.println("Enter search element :");
        search= scan.nextInt();
        int flag=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(arr[i][j]==search){
                    flag=1;
                    System.out.println("Present at : "+i+","+j);
                    break;
                }
            }
        }
        if(flag==0){
            System.out.println("NOT FOUND");
        }

    }
}
