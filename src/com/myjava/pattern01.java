package com.myjava;
import java.util.*;
public class pattern01 {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter number of row :");
        int row=scan.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<row+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
