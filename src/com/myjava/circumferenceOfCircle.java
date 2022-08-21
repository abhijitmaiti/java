package com.myjava;

import java.util.*;
import java.lang.Math.*;

public class circumferenceOfCircle {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        float rad=scan.nextFloat();
        System.out.println("The circumference Of Circle :"+circumferenceOfCircle(rad));

    }
    public static double circumferenceOfCircle(float r){
        double cir= (2*Math.PI*r);
        return cir;
    }
}
