package com.company;
import java.util.*;
public class Array15{

    public static void main(String[] args)
    {
        int[] arr={3,2,1};
        int n= arr.length,small = 0,large = 0,i;
        for( i=n-1;i>0;i--){
            int j=i-1;
            if(arr[i]>arr[j]) {
                small=j;
                break;
            }

        }
        System.out.println("small:"+small);
        for( i=n-1;i>0;i--){
            if(arr[i]>arr[small]) {
                large=i;
                break;
            }
        }
        System.out.println("large:"+large);
        System.out.println("I+"+i);
        swap(arr,small,large);
        if(i==0)
            reverse(arr,small);
        else{
            reverse(arr,small+1);
        }

        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int i,int j){
        int temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void reverse(int[]arr,int start){
        int i = start, j = arr.length - 1;
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

}


