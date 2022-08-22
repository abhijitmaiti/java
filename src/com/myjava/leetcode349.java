package com.myjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class leetcode349 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter n :");
        int n=scan.nextInt();
        System.out.print("Enter m :");
        int m= scan.nextInt();
        int []nums1=new int [n];
        int[]nums2=new int[m];
        System.out.println("________first array_______");
        for(int i=0;i<n;i++){
            nums1[i]=scan.nextInt();
        }
        System.out.println("_______second array_______");
        for (int j=0;j<m;j++){
            nums2[j]= scan.nextInt();
        }
        System.out.println(Arrays.toString(intersection(nums1,nums2)));


    }

    public static Integer[]intersection(int []nums1,int []nums2){
        ArrayList<Integer>list=new ArrayList<>();
        int i=0;
        int start=0;
        int end=nums2.length;
        int mid=start+(end-start)/2;
        while(start<=end){
            if(nums2[mid]==nums1[i]){
                list.add(nums2[mid]);
                i++;
            }
            else if(nums2[mid]>nums1[i]){
                end=mid-1;
            }
            else if(nums2[mid]<nums1[i]){
                start=mid+1;
            }
            mid=start+(end-start)/2;
        }
        Integer []newArr=list.toArray(new Integer[list.size()]);
        Arrays.sort(newArr);
        ArrayList<Integer>newList=new ArrayList<>();
        for(int j=0;j< newArr.length;j++){
            if(newArr[j]==newArr[j+1]){
                newList.add(newArr[i]);
            }
        }
        Integer[]ans=newList.toArray(new Integer[newList.size()]);
        return ans;

    }

}
