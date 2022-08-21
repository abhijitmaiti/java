package com.myjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class pairSum {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int []arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println("Enter num :");
        int s= scan.nextInt();
        System.out.println(pairSum(arr,s));

    }
    public static ArrayList<ArrayList<Integer>> pairSum(int []arr,int s){
        ArrayList<ArrayList<Integer>>list=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                int element=arr[i]+arr[j];
                if(s== element){
                    ArrayList<Integer>temp=new ArrayList<Integer>();
                    //----> non-decreasing
                    temp.add(Math.min(arr[i],arr[j]));
                    temp.add(Math.max(arr[i],arr[j]));
                    list.add(temp);
//                    System.out.println(arr[i]+","+arr[j]);

                }
            }
        }

        return list;
    }
}
