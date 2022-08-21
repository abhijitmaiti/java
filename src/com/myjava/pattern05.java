package com.myjava;
import java.util.*;
public class pattern05 {
    public static void main(String []args){
        int row;
        Scanner scan=new Scanner(System.in);
        row=scan.nextInt();
        for(int i=0;i<row;i++){
            for(int space=0;space<(row-1-i);space++){
                System.out.print(" ");
            }
            for(int star=0;star<(i+1);star++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
