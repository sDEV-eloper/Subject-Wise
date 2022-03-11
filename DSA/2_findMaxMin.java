package com.DSA;

import java.util.Arrays;

public class Array2 {
    public static void main(String[] args){
        int[] arr= { 14,7,2,54,23};
        //int n=arr.length;
        int max=arr[0];
        for (int j : arr) {
            if (j > max)
                max = j;
        }
        int min=arr[0];
        for (int j : arr) {
            if (j < min)
                min = j;
        }
        System.out.println("Max:"+max);
        System.out.println("Min:"+min);
    }
}
