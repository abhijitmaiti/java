package com.myjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class reverseArray {
    public static void main(String[] args) {
        ArrayList<Integer>arr=new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        reverseArray(arr,3);



    }
    public static void reverseArray(ArrayList<Integer> arr, int m)
    {
        // Write your code here.
        int i=m+1;
        int j=arr.size()-1;
        while(i<=j){
            Collections.swap(arr,i,j);
            i++;
            j--;
        }
        System.out.println(arr);

    }
}
