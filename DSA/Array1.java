// Basic Java program that reverses an array


package com.DSA;
        import java.util.Scanner;
        import java.util.Arrays;

//public class Array1 {
//    public static void main(String[] args) {
//        int[] arr={1,2,3,4,5};
//        int n=arr.length,temp=0;
//        String str = Arrays.toString(arr);
//        System.out.println(str);
//        System.out.println("After reverse");
//        for (int i=0;i<=n-(i+1);i++){
//            temp=arr[i];
//            arr[i]=arr[n-(i+1)];
//            arr[n-(i+1)]=temp;
//
//        }
//        //for (int i=0;i<=n-1;i++)
//        //System.out.println(arr[i]);
//        System.out.println(Arrays.toString(arr));
//
//    }
//}


//GeeksForGeeks Approach

//
//public class Array1{
//    // function that reverses array and stores it
//    // in another array
//    static void reverse(int a[], int n)
//    {
//        int[] b = new int[n];
//        int j = n;
//        for (int i = 0; i < n; i++) {
//            b[j - 1] = a[i];
//            j = j - 1;
//        }
//
//        // printing the reversed array
//        System.out.println("Reversed array is: \n");
//        for (int k = 0; k < n; k++) {
//            System.out.println(b[k]);
//        }
//    }
//
//    public static void main(String[] args)
//    {
//        int [] arr = {10, 20, 30, 40, 50};
//        reverse(arr, arr.length);
//    }
//}


// Recursive Java Program to reverse an array

class Array1 {

    /* Function to reverse arr[] from start to end*/
    static void rvereseArray(int arr[], int start, int end)
    {
        int temp;
        if (start >= end)
            return;
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        rvereseArray(arr, start+1, end-1);
    }

    /* Utility that prints out an array on a line */
    static void printArray(int arr[], int size)
    {
        for (int i=0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }

    /*Driver function to check for above functions*/
    public static void main (String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        printArray(arr, 6);
        rvereseArray(arr, 0, 5);
        System.out.println("Reversed array is ");
        printArray(arr, 6);
    }
}
