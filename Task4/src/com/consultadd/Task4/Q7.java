package com.consultadd.Task4;

import java.util.Arrays;

/*
 * 7. Write a Java program to get the difference between the largest and smallest values in an array of integers.
 * The length of the array must be 1 and above.
 *
 * @author Girija
 */
public class Q7 {
    public static void main(String[] args) {
        Q7 q7 = new Q7();
        q7.largestAndSmallestDifference();
    }

    private void largestAndSmallestDifference() {
        int[] arr={8};//{1,2,3,4,1,2,4,5};
        Arrays.sort(arr);
        int len=arr.length;
        int diff=0;
        for(int i=0;i<len;i++){
            System.out.print(arr[i]);
        }
         diff=arr[len-1]-arr[0];
        System.out.println("\nLargest and smallest Difference : "+arr[len-1]+"-" + arr[0]+"="+ diff);
    }
}
