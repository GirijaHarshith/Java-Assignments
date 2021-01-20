package com.consultadd.Task4;
import java.lang.Math;
import java.util.ArrayList;
import java.util.List;

/*
 * 10. Write a Java program to find the two elements from a given array of positive and negative numbers such that their sum is closest to zero.
 *  hint: minimum sum(closest to 0) between two numbers from +ve and -ve numbers in array .e.g:60,-50,40,-35 o/p:40 -35 (sum:5)
 * @author Girija
 */
public class Q10 {
    public static void main(String[] args) {
        Q10 q10 = new Q10();
        int[] arr={60,-50,-35,-40};
        int result = q10.minSumPair(arr);
        System.out.println("Minimum sum(closest to 0) : " + result);
    }

    private int minSumPair(int[] arr) {
        int min=Integer.MAX_VALUE;
        int diff=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++) {
                diff =Math.abs(arr[i]+arr[j]);
                min=Math.min(min,diff);
//                if(diff<min)       //(instead of Math.min(min,diff))
//                    min=diff;
            }
        }
        return min;
    }
}
