package com.myjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class frequencyOfElementOccurTwice442 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int []arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println(frequencyOfElement(arr));
    }
    public static ArrayList<Integer> frequencyOfElement(int []arr){
        Arrays.sort(arr);
        ArrayList<Integer>newArray=new ArrayList<>();
        for(int i=0;i<arr.length-1;i++){
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
                else{
                    break;
                }
            }
            if(count==2){
                newArray.add(arr[i]);
                i+=count-1;
            }
        }
        return newArray;

    }
}
