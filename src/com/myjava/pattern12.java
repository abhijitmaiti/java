package com.myjava;

import java.util.Scanner;

public class pattern12 {
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        int row=scan.nextInt();
        for(int i=0;i<row;i++){
            for(int space=0;space<(row-1)-i;space++){
                System.out.print(" ");
            }
            for(int Lnum=0;Lnum<(i+1);Lnum++){
                System.out.print((i+1)-Lnum);
            }
            for(int Rnum=1;Rnum<(i+1);Rnum++){
                System.out.print(Rnum+1);
            }
            System.out.println();
        }

    }
}
