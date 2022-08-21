package com.myjava;

import java.util.Scanner;

public class pattern10 {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int row= scan.nextInt();
        for(int i=0;i<row;i++){
            for(int lSpace=0;lSpace<(row-1-i);lSpace++){
                System.out.print(" ");
            }
            for(int lStar=0;lStar<(i+1);lStar++){
                System.out.print("*");
            }
            for(int rStar=0;rStar<(row-1-i);rStar++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
