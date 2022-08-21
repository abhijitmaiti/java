package com.myjava;

import java.util.Scanner;

public class pattern11 {
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        int row= scan.nextInt();
        for(int i=0;i<row;i++){
            for(int space=0;space<(row-1-i);space++){
                System.out.print(" ");
            }
            for(int num=0;num<(i+1);num++){
                System.out.print(i+1+" ");
            }
            System.out.println();
        }
    }
}
