package com.DSA;

import java.util.Arrays;

public class Array12 {
    public static void main(String[] args) {
        int[] arr1={0,2,6,8,9};
        int[] arr2={1,3,5,7};
        int n=arr1.length;
        int m=arr2.length;
        mergeArrays(arr1,arr2,m,n);
    }
   static void mergeArrays(int[] arr1, int[] arr2, int m, int n) {
       //int size=m+n;
       int i;
        int[] arr3=new int[m+n];
       for( i=0;i<n;i++)
           arr3[i] = arr1[i];
       for(int j = 0; j<m; j++)
           arr3[i++] = arr2[j];
Arrays.sort(arr3);
       for( i=0;i<m+n;i++)
       System.out.print(arr3[i]+" ");
        // code here
    }
}
