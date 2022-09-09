package com.myjava;

import java.util.Arrays;
import java.util.Scanner;

public class optimizeBubbleSort {
    public static void main(String[] args) {
        System.out.println("Enter a number :");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]= scan.nextInt();
        }
        System.out.println(Arrays.toString(sort(a,n)));

    }
    //time complexity is O(N)-->optimize
    //space complexity is O(1)
    public static int []sort(int []a,int n){
        for(int i=0;i<n-1;i++){
            boolean isSwapped=false;
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    isSwapped=true;
                }
            }
            if (isSwapped==false){
                break;
            }
        }
        return a;

    }
}
