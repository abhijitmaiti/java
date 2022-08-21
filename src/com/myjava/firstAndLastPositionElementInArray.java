package com.myjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class firstAndLastPositionElementInArray {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        ArrayList<Integer>arr=new ArrayList<>(n);
        for(int i=0;i<n;i++){
            int el=scan.nextInt();
            arr.get(el);
        }
        System.out.println("Enter target element :-");
        int target=scan.nextInt();
        System.out.println(Arrays.toString(firstAndLastPosition(arr,n,target)));
    }
    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
        // Write your code here.
        int[]newArr=new int[2];
        int a=0,b=0;
        int start=0,end=n-1;
        for(int i=start;i<end;i++){
            int mid=start+(end-start)/2;
            if(k==arr.get(mid)){
                if(arr.get(mid)>arr.get(mid-1)){
                    a=mid;
                }
                for(int j=i;j<end;j++){

                    if(arr.get(mid)==arr.get(mid-1)){

                        a=mid-1;
                    }
                    if(arr.get(mid)==arr.get(end-1)){
                        b=end-1;
                        break;
                    }
                    else{
                        end--;
                    }
                }
                newArr[0]=a;
                newArr[1]=b;
                return newArr;
            }
            else if(k>arr.get(mid)){
                start=mid+1;
            }
            else if(k<arr.get(mid)){
                end=mid-1;
            }

        }
        newArr[0]=-1;
        newArr[1]=-1;
        return newArr;
    }

}



