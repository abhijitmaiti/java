package com.myjava;

import java.util.Scanner;

public class uniqueElement {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int []arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println(unique(arr));
    }
    public static int unique(int []arr){
        int a=0;
        for(int i=0;i<arr.length;i++){
            a=a^arr[i];
        }
        return a;
    }
}
