package com.myjava;

import java.util.Arrays;
import java.util.Scanner;

public class mergeTwoArray {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.print("Enter n :");
        int n= scan.nextInt();
        int[]a=new int[n];
        for(int i=0;i<n;i++){
            a[i]= scan.nextInt();
        }
        System.out.print("Enter m :");
        int m= scan.nextInt();
        int[]b=new int[m];
        for(int i=0;i<m;i++){
            b[i]= scan.nextInt();
        }
        System.out.println(Arrays.toString(merge(a,b,n,m)));

    }
    public static int[] merge(int[]a,int []b,int n,int m){
        int[]c=new int[m+n];
        int k=0;
//        for(int i=0;i<n;i++){
//            c[i]=a[i];
//        }
//        for(int j=n;j<m+n;j++){
//            c[j]=b[k];
//            k++;
//        }
//        Arrays.sort(c);
        int i=0,j=0;
        while(i<n && j<m){
            if(a[i]<b[j]){
                c[k++]=a[i++];
            }
            else{
                c[k++]=b[j++];
            }
        }
        while(i<n){
            c[k++]=a[i++];
        }
        while (j<m){
            c[k++]=b[j++];
        }
        return c ;
    }
}
