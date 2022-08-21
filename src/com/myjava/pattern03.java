package com.myjava;
import java.util.Scanner;
public class pattern03 {
    public static void main(String[]args){
        int row;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter number of col :");
        row=scan.nextInt();

        for(int i=0;i<row;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
