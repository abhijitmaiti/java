package com.myjava;
import java.util.Scanner;

public class maxAndMinArray {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        int []arr=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=scan.nextInt();
        }
    }
}
