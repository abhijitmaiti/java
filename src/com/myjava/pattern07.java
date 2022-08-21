package com.myjava;
import java.util.Scanner;
public class pattern07 {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int row=scan.nextInt();
        int num=1;
        for(int i=0;i<row;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(num);
                num++;
            }
            System.out.println();
        }

    }
}
