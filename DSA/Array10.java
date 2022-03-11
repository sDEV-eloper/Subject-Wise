package com.DSA;
import java.util.*;
import java.io.*;

class Array10 {
    // Returns minimum number of
    // jumps to reach arr[h] from arr[l]
    static int minJumps(int[] arr)
    {
        if (arr.length <= 1)
            return 0;
        // Return -1 if not possible to jump
        if (arr[0] == 0)
            return -1;
        int maxReach = arr[0];
        int step = arr[0];
        int jump = 1;
        // Start traversing array    { 1, 3, 6, 3, 2, 3, 6, 8, 9, 5 };
        for (int i = 1; i < arr.length; i++) {
            if (i == arr.length - 1)
                return jump;
            System.out.println(maxReach+" "+(i+arr[i]));
            maxReach = Math.max(maxReach, i + arr[i]);
            step--;  // we use a step to get to the current index

            if (step == 0) {
                jump++;
              //  System.out.print(" jump="+jump);
                if (i >= maxReach)
                    return -1;
                step = maxReach - i;

            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int[] arr = { 1, 3, 6, 3, 2, 3, 6, 8, 9, 5 };
        int n = arr.length;
        System.out.print("Minimum number of jumps: "
                + minJumps(arr));
    }
}