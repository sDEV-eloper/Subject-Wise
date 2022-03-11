package com.DSA;
import java.util.Arrays;
//find duplicate in an array of N+1 Integers
public class Array11 {
    public static void main(String[] args) {
    int[] arr={2,3,1,32,6,3,1,61};
    //Arrays.sort(arr);
    int n=arr.length;
    for(int i=1;i<n;i++){
        if(arr[i]==arr[i-1]){
            System.out.println(arr[i]);
        }
    }
}
}
