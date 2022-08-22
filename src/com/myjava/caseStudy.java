package com.myjava;

import java.util.ArrayList;

public class caseStudy {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        Integer []arr=list.toArray(new Integer[list.size()]);
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
