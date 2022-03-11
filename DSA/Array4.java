//Given an array which consists of only 0, 1 and 2. Sort the array without using any sorting algo

package com.DSA;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Array4 {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 2, 1};
        int[] arr1 = new int[100];
        int n = arr.length;
        sortArray(arr, arr1, n);
    }

    static void sortArray(int[] arr, int[] arr1, int n) {
        int min = arr[0];
        int c0 = 0, c1 = 0, c2 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0)
                c0++;//12
           else if (arr[i] == 1)
                c1++; //123
            if (arr[i] == 2)
                c2++;//1
        }
        for (int i = 0; i < c0; i++)
            arr[i] = 0;  //0 0
        for (int i = c0; i < (c1+c0); i++)
            arr[i] = 1;
        for (int i = (c1+c0); i < (c0+c1+c2); i++)
            arr[i] = 2;

            System.out.println(Arrays.toString(arr));

    }
}