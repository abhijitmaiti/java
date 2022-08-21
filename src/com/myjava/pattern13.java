package com.myjava;

import java.util.Scanner;

public class pattern13 {
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        int row=scan.nextInt();
        for(int i=0;i<row;i++){
            for(int upperSpcae =0;upperSpcae<(row-1)-i;upperSpcae++){
                System.out.print(" ");
            }
            for(int upperStar=0;upperStar<(i*2)+1;upperStar++){
                System.out.print("*");
            }
            System.out.println();

        }




    }
}
