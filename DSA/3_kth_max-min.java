package com.DSA;
import java.util.Arrays;
import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
       // int[] arr={ 70,13,11,40,12,5};
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       int[] arr=new int[n];

       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
       }
       int k= sc.nextInt();
       int kth_min=findMinKth(arr,k);
       int kth_max=findMaxKth(arr,k,n);
        System.out.println(Arrays.toString(arr));
        System.out.println(k+"th min:"+kth_min);
        System.out.println(k+"th max:"+kth_max);
    }


    //find kth minimum element
    static int findMinKth(int[] arr, int k){
        Arrays.sort(arr);
        int min=0;
        min=arr[k-1];
        return min;
  }
//find kth max element
  static int findMaxKth(int[] arr, int k,int n) {
      Arrays.sort(arr);
        int max = 0;
          max = arr[n-k];

      return max;
  }
}

