package com.myjava;

import java.util.Scanner;

public class pattern08 {
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        int row=scan.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<i+1;j++){
                if((i+j)%2!=0){
                    System.out.print(0);
                }
                else{
                    System.out.print(1);
                }
            }
            System.out.println();
        }
    }
}
