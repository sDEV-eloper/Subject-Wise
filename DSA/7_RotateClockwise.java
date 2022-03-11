package com.DSA;
//Write a program to cyclically rotate an array by one.
public class Array7 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n=arr.length;
        rotate(arr,n);
    }
    static void rotate(int[] arr, int n)
    {
int t=0;
        for(int i=0;i<n;i++){
            t=arr[i];
                arr[i]=arr[n-1];
                arr[n-1]=t;

        }

        for(int i=0;i<n;i++)
             System.out.print(arr[i]+" ");
    }
}
