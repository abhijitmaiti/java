package com.myjava;

import java.util.Scanner;

public class findTheXDublicateElement {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int []arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println(dublicate(arr));
    }
    public static int dublicate(int []arr){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans=ans^arr[i];
        }
        //XOR [1,n-1]
        for(int j=1;j<arr.length;j++){
            ans=ans^j;
        }
        return ans;
    }
}
