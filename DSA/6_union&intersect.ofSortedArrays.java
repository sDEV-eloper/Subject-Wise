
//Find the Union and Intersection of the two sorted arrays.
package com.DSA;
import java.util.Arrays;

public class Array6 {
    public static void main(String[] args) {
    int[] arr1={1,2,3};
    int[] arr2={3,4,5,6,8,9};
        int n1=arr1.length;
        int n2=arr2.length;

    UnionArray(arr1,arr2,n1,n2);
    }
    static void UnionArray(int[] arr1,int[] arr2,int n1,int n2){
        int i,j;
        int[] arr=new int[n1+n2];
        for( i=0;i<n1;i++)
            arr[i]=arr1[i];
        for( j = 0; j<n2; j++)
            arr[i++]=arr2[j];

        System.out.println(Arrays.toString(arr));
    }

static void IntersectArray(int[] arr1,int[] arr2,int n1,int n2){
    int i,j,k=0;
    int[] arr=new int[n1+n2];
    for( i=0;i<n1;i++) {
        for (j = 0; j < n2; j++) {
            if (arr1[i] == arr2[j]) {
                arr[k++] = arr1[i];

            }

        }
    }

    System.out.println(Arrays.toString(arr));
}
}
