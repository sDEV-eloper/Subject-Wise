
//Minimise the maximum difference between heights [V.IMP]
package com.DSA;
import java.util.Arrays;

public class Array9 {
    public static void main(String[] args) {
        int[] arr={2,6,3,4,7,2,10,3,2,1};
        int n=arr.length;        int k=5;
        int res=minDiff(arr,n,k);
        System.out.println(res);
    }
    static int minDiff(int[] arr,int n,int k){

        Arrays.sort(arr);
        //1,2,2,2,3,3,4,6,7,10
        int min=arr[0]; //1
        int max=arr[n-1]; //10
       int diff = max-min; //9
        for(int i = 1; i<n; i++)
        {
            if(arr[i]-k<0)   //6(i=7) 7(i=8) 10(i=9)
                continue;
           //i=7,8,9
            min = Math.min(arr[0]+k, arr[i]-k);//(6,1)
            max = Math.max(arr[n-1]-k, arr[i-1]+k);//(5,9)
            System.out.println(min+" "+max);
            diff = Math.min(diff, max-min);
        }
        return diff;
    }
}
