package com.myjava;

import java.util.Scanner;

public class pattern06 {
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        int row=scan.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
}
