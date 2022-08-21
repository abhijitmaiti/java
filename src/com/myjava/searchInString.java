package com.myjava;

import java.util.Scanner;

public class searchInString {
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        String str=scan.next();
        if(str==" "){
            System.out.println("The string is empty");
        }
        else{
            System.out.print("Enter target element :");
            char target=scan.next().charAt(0);
//            char target='a';

            if(stringCharSearch(str,target)>=0){
                System.out.println("The index is "+stringCharSearch(str,target));
            }
            else{
                System.out.println("Not found");
            }
        }
    }
    public static int stringCharSearch(String str,char target){
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(target==ch){
                return i;
            }
        }
        return -1;

    }
}
