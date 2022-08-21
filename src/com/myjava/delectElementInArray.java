package com.myjava;
import java.util.Scanner;

public class delectElementInArray {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int num;
        System.out.print("Enter number of element :");
        num=scan.nextInt();
        int [] arr=new int[num];
        for(int i=0;i< arr.length;i++){
            System.out.print("Enter Number "+(i+1)+" element :");
            arr[i]=scan.nextInt();
        }
        System.out.println("Before delete element :-");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
        int index;
        System.out.print("Enter the position to delete element :");
        index=scan.nextInt();
        for(int i=index;i< arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        System.out.println("After delete element :-");
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
