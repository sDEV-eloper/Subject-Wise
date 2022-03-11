// Basic Java program that reverses an array


package com.DSA;
        import java.util.Scanner;
        import java.util.Arrays;

public class Array1 {
   public static void main(String[] args) {
       int[] arr={1,2,3,4,5};
       int n=arr.length,temp=0;
       String str = Arrays.toString(arr);
       System.out.println(str);
       System.out.println("After reverse");


       for (int i=0;i<=n-(i+1);i++){
           temp=arr[i];
           arr[i]=arr[n-(i+1)];
           arr[n-(i+1)]=temp;

       }

       for (int i=0;i<=n-1;i++)
       System.out.println(Arrays.toString(arr));

   }
}
