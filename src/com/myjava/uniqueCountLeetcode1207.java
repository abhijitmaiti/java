package com.myjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class uniqueCountLeetcode1207 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int []arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println(uniqueOccurrences(arr));

    }
    public static boolean uniqueOccurrences(int[] arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
                else{
                    break;
                }
            }

            if(count>0){
                list.add(count);
                i+=count-1;
            }
        }
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j< list.size();j++){
                if(list.get(i)== list.get(j)){
                    return false;
                }
            }

        }
        return true;
    }
}
