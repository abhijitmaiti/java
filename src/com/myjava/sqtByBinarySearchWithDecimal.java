package com.myjava;

import java.util.Scanner;

public class sqtByBinarySearchWithDecimal {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter number :");
        int x=scan.nextInt();
        System.out.println(sqtAfterDecimal(x,3,sqt(x)));

    }
    public static double sqtAfterDecimal(int x,int l,int temp){
        double ans=temp;
        double fact=1;
        for(int i=0;i<l;i++){
            fact=fact/10;
            for(double j=ans;j*j<x;j=j+fact){
                ans=j;
            }
        }
        return ans;

    }
    public static int sqt(int x){
        int start=1;
        int end=x;

        if(x<2){
            return x;
        }
        else {
            while (start<=end){
                int mid=start+(end-start)/2;
                if((long)mid*mid==x){
                    return mid;
                }
                else if((long)mid*mid>x){
                    end=mid-1;
                }
                else if((long)mid*mid<x){
                    start=mid+1;
                }
            }
            return end;
        }
    }

}
