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


//GFG Approach
// Java program of above implementation
//public class GFG {
//    /* Class Pair is used to return two values from getMinMax() */
//    static class Pair {
//
//        int min;
//        int max;
//    }
//
//    static Pair getMinMax(int arr[], int n) {
//        Pair minmax = new Pair();
//        int i;
//
//        /*If there is only one element then return it as min and max both*/
//        if (n == 1) {
//            minmax.max = arr[0];
//            minmax.min = arr[0];
//            return minmax;
//        }
//
//		/* If there are more than one elements, then initialize min
//	and max*/
//        if (arr[0] > arr[1]) {
//            minmax.max = arr[0];
//            minmax.min = arr[1];
//        } else {
//            minmax.max = arr[1];
//            minmax.min = arr[0];
//        }
//
//        for (i = 2; i < n; i++) {
//            if (arr[i] > minmax.max) {
//                minmax.max = arr[i];
//            } else if (arr[i] < minmax.min) {
//                minmax.min = arr[i];
//            }
//        }
//
//        return minmax;
//    }
//
//    /* Driver program to test above function */
//    public static void main(String args[]) {
//        int arr[] = {1000, 11, 445, 1, 330, 3000};
//        int arr_size = 6;
//        Pair minmax = getMinMax(arr, arr_size);
//        System.out.printf("\nMinimum element is %d", minmax.min);
//        System.out.printf("\nMaximum element is %d", minmax.max);
//
//    }
//
//}
