package com.myjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class AggressiveCows {
    public static void main(String[] args) {

        int n;
        Scanner scan=new Scanner(System.in);
        System.out.print("Ebter number of Element :");
        n= scan.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
           a[i]= scan.nextInt();
        }
        System.out.println(aggressiveCows(a,2));


    }
    public static int aggressiveCows(int[]stalls, int k){
        Arrays.sort(stalls);
        int s=0;
        int maxi=-1;
        for(int i=0;i< stalls.length;i++){
            maxi=Math.max(maxi,stalls[i]);
        }
        int e=maxi;
        int ans=-1;
        int mid=s+(e-s)/2;
        while(s<=e){
            if(isPossible(stalls,k,mid)==true){
                ans=mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
            mid=s+(e-s)/2;
        }
        return ans;

    }
    public static boolean isPossible(int[]stalls, int k,int mid){
        int cowsCount=1;
        int lastPosition = stalls[0];

        for(int i=0;i< stalls.length;i++){

            if(stalls[i]-lastPosition >= mid){
                cowsCount++;
                if(cowsCount==k){
                    return true;
                }
                lastPosition = stalls[i];
            }
        }
        return false;
    }
}
