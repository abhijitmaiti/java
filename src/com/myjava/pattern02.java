package com.myjava;
import java.util.*;
public class pattern02 {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int row,col;
        System.out.print("Enter row :");
        row=scan.nextInt();
        System.out.print("Enter col :");
        col=scan.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==0 || j==0||i==row-1||j==col-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println();
        }

    }
}
