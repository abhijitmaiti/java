package com.myjava;

import java.util.Arrays;
import java.util.Scanner;

public class findTheOccurenceOfNUmberInArray {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter number of element in array :-");
        int n=scan.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println("Enter X :");
        int x=scan.nextInt();
        occurenceOfNumber(arr,x);
    }
    public static void occurenceOfNumber(int []arr,int x){
        Arrays.sort(arr);
        int count=0;
        for(int i=0;i< arr.length;i++){
            if(x==arr[i]){
                count++;
            }
        }
        System.out.println(x+"-->"+count);






//        for(int i=0;i<arr.length;i++){
//            int count =1;
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[i]==arr[j]){
//                    count++;
//                }
//                else{
//                    i+=count-1;
//                    break;
//                }
//            }
//            System.out.println(i+"->"+count);
//        }
    }

}
