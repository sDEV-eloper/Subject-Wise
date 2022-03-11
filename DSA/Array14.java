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



//public class Array14{
//1D ARRAY Solution

//    public static void mergeIntervals(Interval[] arr)
//    {
//        if (arr.length <= 0)
//            return;
//        // Create an empty stack of intervals
//        Stack<Interval> stack=new Stack<>();
//        // sort the intervals in increasing order of start time
//        Arrays.sort(arr,new Comparator<Interval>(){
//            public int compare(Interval i1,Interval i2)
//            {
//                return i1.start-i2.start;
//            }
//        });
//
//        // push the first interval to stack
//        stack.push(arr[0]);
//        // Start from the next interval and merge if necessary
//        for (int i = 1 ; i < arr.length; i++)
//        {
//            // get interval from stack top
//            Interval top = stack.peek();
//            // if current interval is not overlapping with stack top,
//            // push it to the stack
//            if (top.end < arr[i].start)
//                stack.push(arr[i]);
//
//                // Otherwise update the ending time of top if ending of current
//                // interval is more
//            else if (top.end < arr[i].end)
//            {
//                top.end = arr[i].end;
//                stack.pop();
//                stack.push(top);
//            }
//        }
//
//        // Print contents of stack
//        System.out.print("The Merged Intervals are: ");
//        while (!stack.isEmpty())
//        {
//            Interval t = stack.pop();
//           // System.out.print("["+t.start+","+t.end+"] ");
//            System.out.println(t);
//        }
//    }
//
//    public static void main(String[] args) {
//        Interval[] arr =new Interval[4];
//        arr[0]=new Interval(6,8);
//        arr[1]=new Interval(1,4);
//        arr[2]=new Interval(2,6);
//        arr[3]=new Interval(4,5);
//        mergeIntervals(arr);
//    }
//}
//
//class Interval
//{
//    int start,end;
//    Interval(int start, int end)
//    {
//        this.start=start;
//        this.end=end;
//    }
//}
//
