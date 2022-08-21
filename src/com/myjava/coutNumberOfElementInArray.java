package com.myjava;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class coutNumberOfElementInArray {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int []arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
//        System.out.println(coutNumber(arr));
        coutNumber(arr);
    }
    public static void coutNumber(int []arr){
        ArrayList<Integer>arrList=new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            int count=1;
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
                else{
                    break;
                }

            }
            if(count>=1){
//                arrList.add(arr[i]);
                System.out.println(arr[i]+"-->"+count);
                i+=(count-1);
            }
        }
//        return arrList;
    }
}
