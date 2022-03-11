package com.DSA;
import java.util.*;
import java.lang.Object;
public class ComparatorTut {
    public static void main(String[] args) {
     ArrayList<Datatype> arr = new ArrayList<Datatype>();
        Datatype a1 = new Datatype(45, 64);
        Datatype a2 = new Datatype(15, 42);
        Datatype a3 = new Datatype(95, 14);
        Datatype a4 = new Datatype(35, 24);
        arr.add(a1);
        arr.add(a2);
        arr.add(a3);
        arr.add(a4);
        for (Datatype i : arr)
            System.out.println(i.x + " " + i.y);
        arr.sort(new myComparator());  //or   Collections.sort(arr, new myComparator());
        System.out.println("After sort:");
        for (Datatype i : arr)
            System.out.println(i.x + " " + i.y);
    }
}
class Datatype {
    int x, y;
    Datatype(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
class myComparator implements Comparator<Datatype>{
   // public int compare(Datatype d1, Datatype d2){return d1.x-d2.x;}     //Increasing Order of x
    public int compare(Datatype d1, Datatype d2){return d1.y-d2.y;}       //Increasing order of y

}


//public class ComparatorTut {
//    public static void main(String[] args) {
//        int[][] arr={{1,2},{12,6},{8,10}};
//        System.out.println(Arrays.deepToString(arr));
//      // Arrays.sort(arr, (a1,a2) -> a2[0] - a1[0]);
//       // Arrays.sort(arr, (int[] a, int[] b) -> a[0] - b[0]);
//        // Arrays.sort(arr, Comparator.comparingInt(a -> a[0]).reversed());      //it shows error
//        System.out.println(Arrays.deepToString(arr));
//    }
//}




