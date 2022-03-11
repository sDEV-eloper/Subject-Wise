// A Java program for merging overlapping intervals
package com.DSA;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Stack;

class Array14 {
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)->Integer.compare(a[0],b[0]));
      //  System.out.println(Arrays.deepToString(intervals));
        ArrayList<int[]> list = new ArrayList<>();
        int i=0;
        int n=intervals.length,s=-1,e=-1;
        System.out.println("interval size:" +n);
        while(i<n){
            if(s==-1){
                s=intervals[i][0];
                e=intervals[i][1];
                list.add(new int[]{s, e});   //add element into arraylist
            }
            else{
                if(intervals[i][0]<=e){
                    e=Math.max(e,intervals[i][1]);
                }
                else{
                    s=intervals[i][0];
                    e=intervals[i][1];
                    list.add(new int[]{s, e});
                }
            }
            i++;
        }

//        if(s!=-1){
//            list.add(new int[]{s, e});  //replace: line21`
//        }
        int[][] arr = new int[list.size()][2];
        return list.toArray(arr);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter no. of elements: ");
//        int n = sc.nextInt();
//        int[][] arr = new int[n][2];
//        for(int i=0;i<n;i++){
//            arr[i][0] = sc.nextInt();
//            arr[i][1] = sc.nextInt();
//        }
        int[][] arr = {{1,13},{12,6},{8,10},{15,18}};
        int[][] ans = merge(arr);
        System.out.println("Intervals after merge operation are:");
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i][0]+" "+ans[i][1]);
        }
    }
}
