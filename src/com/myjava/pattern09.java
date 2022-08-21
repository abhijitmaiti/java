package com.myjava;

import java.util.Scanner;

public class pattern09 {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int row= scan.nextInt();
        int upperRow=row/2;
        for(int i=0;i<upperRow;i++){
            for(int upperLStart=0;upperLStart<i+1;upperLStart++){
                System.out.print("*");
            }
            for(int upperSpace=0;upperSpace<(upperRow-1-i)*2;upperSpace++){
                System.out.print(" ");

            }
            for(int upperRStart=0;upperRStart<i+1;upperRStart++){
                System.out.print("*");
            }
            System.out.println();

        }
        for(int j=upperRow;j<row;j++){
            for(int lowerLstar=0;lowerLstar<row-j;lowerLstar++){
                System.out.print("*");
            }
            for(int lowerLspace=0;lowerLspace<(j*2)-row;lowerLspace++){
                System.out.print(" ");
            }
            for (int lowerRstar=0;lowerRstar<(row-j);lowerRstar++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
