package com.myjava;

import java.util.Scanner;

public class leetcode69 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        System.out.println(sqt(x));

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
