package com.myjava;
import java.util.*;
public class pattern04 {
    public static void main(String[]args){
        Scanner sca=new Scanner(System.in);
        System.out.print("Enter number of row :");
        int row= sca.nextInt();
        for(int i=0;i<row;i++){
            for(int j=row;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
