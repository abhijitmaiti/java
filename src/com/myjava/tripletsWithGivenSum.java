package com.myjava;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class tripletsWithGivenSum {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int []arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println("Enter num :");
        int s= scan.nextInt();
        System.out.println(tripletSum(arr,s));

    }
    public static ArrayList<ArrayList<Integer>> tripletSum(int[]arr,int s){
        int count=0;
        ArrayList<ArrayList<Integer>>list=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k< arr.length;k++){
                    int element=arr[i]+arr[j]+arr[k];
                    if(s==element){
                        count++;
                        ArrayList<Integer>temp=new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k] );
                        Collections.sort(temp);
                        list.add(temp);
                        break;
                    }
                }
                if(count>0){
                    break;
                }
            }
            if(count>0){
                break;
            }

        }
        return list;

    }
}
