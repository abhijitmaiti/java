package com.myjava;

import java.util.Arrays;
import java.util.Scanner;

public class bookAllocationProblem {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter number of Book :");
        int n=scan.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= scan.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Enter number of student :");
        int m=scan.nextInt();
        System.out.println(bookAllocation(arr,m));
    }
    public static int bookAllocation(int []arr,int m){
        int ans =-1;
        int s=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        int e=sum;
        int mid =s+(e-s)/2;
        while(s<=e){
            if(isPossibleSolution(arr,mid,m)==true){
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
    public static boolean isPossibleSolution(int[]arr,int mid ,int m){
        int studentCount=1;
        int pageSum=0;
        for(int i=0;i<arr.length;i++){
            if(pageSum+arr[i]<=mid){
                pageSum+=arr[i];
            }
            else{
                studentCount++;
                if(studentCount>m||arr[i]>mid) {
                    return false;
                }
                else{
                    pageSum=arr[i];
                }
            }
        }
        return  true;
    }
}
